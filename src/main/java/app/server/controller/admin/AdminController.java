package app.server.controller.admin;

import app.server.service.CourseService;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    CourseService courseService;
    @RequestMapping(value = "/setCourseAnonymous")
    public String setCourseAnonymous(@RequestBody CourseVO course){
        return courseService.setCourseAnonymous(course.getID(),course.isAnonymous());
    }
    @RequestMapping(value = "/confirmCourse")
    public String confirmCourse(String ID){
        return courseService.confirmCourse(ID);
    }
    @RequestMapping(value = "/getUnconfirmList")
    public List<CourseVO> getUnconfirmList(){
        return courseService.getUnconfirmList();
    }

}