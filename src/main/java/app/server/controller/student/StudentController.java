package app.server.controller.student;

import app.server.bean.Student;
import app.server.service.CommentService;
import app.server.service.CourseService;
import app.server.service.StudentService;
import app.server.util.LoggerUtil;
import app.server.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private CommentService commentService;
    private StudentService studentService;
    private CourseService courseService;

    @Autowired
    public StudentController(CommentService commentService,StudentService studentService,CourseService courseService){
        this.commentService = commentService;
        this.studentService = studentService;
        this.courseService = courseService;
    }
    @PostMapping(value = "/login")//String username,String password
    public String login(@RequestBody StudentVO student){
        LoggerUtil.loggerUtil.logInfo("login");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        return studentService.login(student.getUsername(),student.getPassword());
    }

    @PostMapping(value = "/register")//String username,String password,String admin,String college,String major,String studentNumber
    public String register(@RequestBody StudentVO student){
        LoggerUtil.loggerUtil.logInfo("register");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        LoggerUtil.loggerUtil.logInfo(student.getSchool());
        LoggerUtil.loggerUtil.logInfo(student.getStudentNumber());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());

        return studentService.register(student.getUsername(),student.getPassword(),student.getSchool(),student.getCollege(),student.getMajor(),student.getStudentNumber());
    }

    @PostMapping(value = "getStudentInfo")
    public Student getStudentInfo(String userName){
        return studentService.getStudentInfo(userName);
    }

    @PostMapping(value = "/updateStudentInfo")//String username,String password,String admin,String college,String majorString studentNumber
    public String updateStudentInfo(@RequestBody StudentVO student){
        LoggerUtil.loggerUtil.logInfo("updateStudentInfo");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        LoggerUtil.loggerUtil.logInfo(student.getSchool());
        LoggerUtil.loggerUtil.logInfo(student.getStudentNumber());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());

        return studentService.updateStudentInfo(student.getUsername(),student.getSchool(),student.getCollege(),student.getMajor(),student.getStudentNumber());
    }
    @PostMapping(value = "/updateStudentPassword")//String username,String password,String admin,String college,String majorString studentNumber
    public String updateStudentPassword(@RequestBody StudentVO student){
        LoggerUtil.loggerUtil.logInfo("updateStudentPassword");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        LoggerUtil.loggerUtil.logInfo(student.getSchool());
        LoggerUtil.loggerUtil.logInfo(student.getStudentNumber());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());

        return studentService.updateStudentPassword(student.getUsername(),student.getPassword(),student.getSchool());
    }
    @RequestMapping(value = "/comment")
    public String comment(@RequestBody CommentVO commentVO){
        LoggerUtil.loggerUtil.logInfo("Comment");
        LoggerUtil.loggerUtil.logInfo("AnswerTo "+commentVO.getAnswerTo());
        LoggerUtil.loggerUtil.logInfo("Commenter "+commentVO.getCommenter());
        return commentService.comment(commentVO);
    }
    @RequestMapping(value = "/like")
    public String like(@RequestBody LikeVO like){
        return commentService.like(like.getUsername(),like.getCommentId());
    }
    @RequestMapping(value = "/collect")
    public String collect(@RequestBody CollectVO collect){
        return courseService.collect(collect.getUsername(),collect.getCourseId());
    }

    @RequestMapping(value = "/cancelLike")
    public String cancelLike(@RequestBody LikeVO like){
        return commentService.cancelLike(like.getUsername(),like.getCommentId());
    }
    @RequestMapping(value = "/cancelCollect")
    public String cancelCollect(@RequestBody CollectVO collect){
        return courseService.cancelCollect(collect.getUsername(),collect.getCourseId());
    }
    @RequestMapping(value = "/createCourse")
    public String createCourse(@RequestBody CourseVO courseVO){
        return courseService.createCourse(courseVO.getId(),courseVO.getName(),courseVO.getTeacherName());
    }
    @RequestMapping(value = "/getCollectList")
    public List<CourseVO> getCollectList(String username){
        return courseService.getCollectList(username);
    }
}
