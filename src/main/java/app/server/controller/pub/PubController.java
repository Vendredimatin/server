package app.server.controller.pub;

import app.server.service.CommentService;
import app.server.service.CourseService;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PubController {
    @Autowired
    CommentService commentService;
    @Autowired
    CourseService courseService;
    @RequestMapping("/getCourseComment")
    public List<CommentVO> getCourseComment(String courseId){
        return commentService.getCourseComment(courseId);
    }

    @RequestMapping("/getCourses")
    public List<CourseVO> getCourses(){
        return courseService.getCourses();
    }

}
