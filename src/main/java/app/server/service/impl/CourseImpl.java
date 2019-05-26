package app.server.service.impl;

import app.server.bean.Course;
import app.server.dao.CourseDAO;
import app.server.service.CourseService;
import app.server.util.PtoV;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseImpl implements CourseService {
    @Autowired
    CourseDAO courseDAO;
    @Override
    public List<CourseVO> getCourses() {
        List<Course> courses = courseDAO.findAll();
        List<CourseVO> res = new ArrayList<>();
        for(Course course:courses){
            res.add(PtoV.ptoV.getCourseVO(course));
        }
        return res;
    }
}
