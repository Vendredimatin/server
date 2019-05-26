package app.server.controller.pub;

import app.server.vo.CommentVO;
import app.server.vo.CourseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class pubController {
    @RequestMapping("/getCourseComment")
    public CommentVO getCourseComment(String courseId){
        return null;
    }

    @RequestMapping("/getCourses")
    public List<CourseVO> getCourses(){
        return null;
    }

}
