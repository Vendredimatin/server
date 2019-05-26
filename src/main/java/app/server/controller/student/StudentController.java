package app.server.controller.student;

import app.server.bean.Collect;
import app.server.bean.Like;
import app.server.bean.Student;
import app.server.service.CommentService;
import app.server.service.CourseService;
import app.server.service.StudentService;
import app.server.util.LoggerUtil;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    CommentService commentService;
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;

//    @Autowired
//    public StudentController(CommentService commentService,StudentService studentService,CourseService courseService){
//        this.commentService = commentService;
//        this.studentService = studentService;
//        this.courseService = courseService;
//    }
    @PostMapping(value = "/login")//String username,String password
    public String login(@RequestBody Student student){
        LoggerUtil.loggerUtil.logInfo("login");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        return studentService.login(student.getUsername(),student.getPassword());
    }

    @PostMapping(value = "/register")//String username,String password,String admin,String college,String major,String studentNumber
    public String register(@RequestBody Student student){
        LoggerUtil.loggerUtil.logInfo("register");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        LoggerUtil.loggerUtil.logInfo(student.getSchool());
        LoggerUtil.loggerUtil.logInfo(student.getStudentNumber());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());

        return studentService.register(student.getUsername(),student.getPassword(),student.getSchool(),student.getCollege(),student.getMajor(),student.getStudentNumber());
    }
    @PostMapping(value = "/updateStudentInfo")//String username,String password,String admin,String college,String majorString studentNumber
    public String updateStudentInfo(@RequestBody Student student){
        LoggerUtil.loggerUtil.logInfo("updateStudentInfo");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        LoggerUtil.loggerUtil.logInfo(student.getSchool());
        LoggerUtil.loggerUtil.logInfo(student.getStudentNumber());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());

        return studentService.updateStudentInfo(student.getUsername(),student.getSchool(),student.getCollege(),student.getMajor(),student.getStudentNumber());
    }
    @PostMapping(value = "/updateStudentPassword")//String username,String password,String admin,String college,String majorString studentNumber
    public String updateStudentPassword(@RequestBody Student student){
        LoggerUtil.loggerUtil.logInfo("updateStudentPassword");
        LoggerUtil.loggerUtil.logInfo(student.getUsername());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());
        LoggerUtil.loggerUtil.logInfo(student.getSchool());
        LoggerUtil.loggerUtil.logInfo(student.getStudentNumber());
        LoggerUtil.loggerUtil.logInfo(student.getPassword());

        return studentService.updateStudentPassword(student.getUsername(),student.getPassword(),student.getSchool());
    }
    @RequestMapping(value = "/commnet")
    public String comment(@RequestBody CommentVO commentVO){
        return commentService.comment(commentVO);
    }
    @RequestMapping(value = "/like")
    public String like(@RequestBody Like like){
        System.out.println(like.getCommentId());
        return commentService.like(like.getUsername(),like.getCommentId());
    }
    @RequestMapping(value = "/collect")
    public String collect(@RequestBody Collect collect){
        return courseService.collect(collect.getUsername(),collect.getCourseId());
    }

    @RequestMapping(value = "/cancelLike")
    public String cancelLike(@RequestBody Like like){
        return commentService.cancelLike(like.getUsername(),like.getCommentId());
    }
    @RequestMapping(value = "/cancelCollect")
    public String cancelCollect(@RequestBody Collect collect){
        return courseService.cancelCollect(collect.getUsername(),collect.getCourseId());
    }
    @RequestMapping(value = "/createCourse")
    public String createCourse(@RequestBody CourseVO courseVO){
        return courseService.createCourse(courseVO.getID(),courseVO.getName(),courseVO.getTeacherName());
    }
}
