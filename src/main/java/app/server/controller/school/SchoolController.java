package app.server.controller.school;

import app.server.service.CourseService;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    @Autowired
    CourseService courseService;
    @RequestMapping(value = "/setCourseAnonymous")
    public String setCourseAnonymous(@RequestBody CourseVO course){
        return courseService.setCourseAnonymous(course.getID(),course.isAnonymous());
    }
}
