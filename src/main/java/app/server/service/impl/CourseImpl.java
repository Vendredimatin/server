package app.server.service.impl;

import app.server.bean.Collect;
import app.server.bean.Course;
import app.server.dao.CollectDAO;
import app.server.dao.CourseDAO;
import app.server.service.CourseService;
import app.server.util.LoggerUtil;
import app.server.util.PtoV;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseImpl implements CourseService {
    
    private static final String SUC$ = "SUCCESS";
    private static final String FAIL$ = "FAILURE";

    @Autowired
    CourseDAO courseDAO;
    @Autowired
    CollectDAO collectDAO;

    @Override
    public List<CourseVO> getCourses(String username) {
        List<Course> courses = courseDAO.findAll();
        List<CourseVO> res = new ArrayList<>();
        List<Collect> collects = collectDAO.findAllByUsername(username);
        List<String> cids = new ArrayList<>();
        for(Collect c:collects){
            cids.add(c.getCourseId());
        }
        for(Course course:courses){
            CourseVO courseVO = PtoV.ptoV.getCourseVO(course);
            if(cids.contains(course.getID()))courseVO.setCollect(true);
            res.add(courseVO);
        }
        return res;
    }

    @Override
    public String setCourseAnonymous(String id, boolean anonymous) {

        if(courseDAO.existsById(id)) {
            Course course = courseDAO.findById(id).get();
            if (course.isAnonymous() != anonymous) {
                course.setAnonymous(anonymous);
                courseDAO.save(course);
            }
            return SUC$;
        }
        return FAIL$;
    }

    @Override
    public String collect(String username, String courseId) {
        Collect collect = new Collect();
        collect.setCourseId(courseId);
        collect.setUsername(username);
        try{
            collectDAO.save(collect);
            return SUC$;
        }catch (Exception e){
            e.printStackTrace();
            LoggerUtil.loggerUtil.logErr("CollectERR "+username+courseId);
            return FAIL$;
        }
    }

    @Override
    public String cancelCollect(String username, String courseId) {
        if(collectDAO.existsByCourseIdAndUsername(courseId,username)){
            collectDAO.deleteByCourseIdAndUsername(courseId,username);
            return SUC$;
        }
        return FAIL$;
    }

    @Override
    public CourseVO getCourseById(String id,String username) {
        if(courseDAO.existsById(id)){
            CourseVO courseVO = PtoV.ptoV.getCourseVO(courseDAO.findById(id).get());
            if(collectDAO.existsByCourseIdAndUsername(id,username))courseVO.setCollect(true);
            return courseVO;
        }
        return null;
    }
}
