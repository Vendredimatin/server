package app.server.service.impl;

import app.server.bean.Collect;
import app.server.bean.Course;
import app.server.bean.RatingDetail;
import app.server.dao.CollectDAO;
import app.server.dao.CourseDAO;
import app.server.service.CFService;
import app.server.service.CourseService;
import app.server.util.CollaboratIveFiltering;
import app.server.util.LoggerUtil;
import app.server.util.PtoV;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static app.server.constants.Constants.FAIL;
import static app.server.constants.Constants.SUC;

@Service
public class CourseImpl implements CourseService {
    private CourseDAO courseDAO;
    private CollectDAO collectDAO;
    private CFService cfService;
    public CourseImpl() {
    }

    @Autowired
    public CourseImpl(CourseDAO courseDAO, CollectDAO collectDAO,CFService cfService) {
        this.courseDAO = courseDAO;
        this.collectDAO = collectDAO;
        this.cfService = cfService;
    }

    @Override
    public List<CourseVO> getCourses(String username) {
        List<Course> courses = courseDAO.findAll();
        courses = courses.stream().filter(c -> c.isAlive()).collect(Collectors.toList());
        System.out.println(courses);
        List<CourseVO> res = new ArrayList<>();
        List<Collect> collects = collectDAO.findAllByUsername(username);
        List<String> cids = new ArrayList<>();
        Map<String,Double> map = cfService.getRecommendCourses(username);
        for (Collect c : collects) {
            cids.add(c.getCourseId());
        }
        for (Course course : courses) {
            CourseVO courseVO = PtoV.ptoV.getCourseVO(course);
            String cid = course.getId();
            if (cids.contains(cid)) courseVO.setCollect(true);
            else if(map.containsKey(cid)){
                courseVO.setRecommend(map.get(cid));
            }
            res.add(courseVO);
        }


        return res;
    }

    @Override
    public String setCourseAnonymous(String id, boolean anonymous) {

        if (id != null && courseDAO.existsById(id)) {
            Course course = courseDAO.findById(id).get();
            if (course.isAnonymous() != anonymous) {
                course.setAnonymous(anonymous);
                courseDAO.save(course);
            }
            return SUC;
        }
        return FAIL;
    }

    @Override
    public String collect(String username, String courseId) {
        Collect collect = new Collect();
        collect.setCourseId(courseId);
        collect.setUsername(username);
        try {
            collectDAO.save(collect);
            return SUC;
        } catch (Exception e) {
            LoggerUtil.loggerUtil.logErr(e.getMessage());
            return FAIL;
        }
    }

    @Transactional
    @Override
    public String cancelCollect(String username, String courseId) {
        if (username != null && collectDAO.existsByCourseIdAndUsername(courseId, username)) {
            collectDAO.deleteByCourseIdAndUsername(courseId, username);
            return SUC;
        }
        return FAIL;
    }

    @Override
    public CourseVO getCourseById(String id, String username) {
        if (id != null && courseDAO.existsById(id)) {
            CourseVO courseVO = PtoV.ptoV.getCourseVO(courseDAO.findById(id).get());
            if (collectDAO.existsByCourseIdAndUsername(id, username)) courseVO.setCollect(true);
            return courseVO;
        }
        return null;
    }

    @Transactional
    @Override
    public String createCourse(String id, String name, String teacherName) {
        if (id == null || courseDAO.existsById(id)) return FAIL;
        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setTeacherName(teacherName);
        course.setRatingDetail(new RatingDetail());
        courseDAO.save(course);
        return SUC;
    }

    @Transactional
    @Override
    public String confirmCourse(String id) {
        if (id != null && courseDAO.existsById(id)) {
            Course course = courseDAO.findById(id).get();
            course.setAlive(true);
            courseDAO.save(course);
            return SUC;
        }
        return FAIL;
    }

    @Override
    public List<CourseVO> getUnconfirmList() {
        List<Course> courses = courseDAO.findAllByAlive(false);
        List<CourseVO> res = new ArrayList<>();
        for (Course course : courses) {
            res.add(PtoV.ptoV.getCourseVO(course));
        }
        return res;
    }

    @Override
    public List<CourseVO> getCollectList(String username) {
        List<CourseVO> courseVOS = getCourses(username);
        List<CourseVO> res = new ArrayList<>();
        for (CourseVO courseVO : courseVOS) {
            if (courseVO.isCollect()) {
                res.add(courseVO);
            }
        }
        return res;
    }
}
