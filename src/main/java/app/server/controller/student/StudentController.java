package app.server.controller.student;

import app.server.bean.Student;
import app.server.service.CommentService;
import app.server.service.StudentService;
import app.server.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    CommentService commentService;
    @Autowired
    StudentService studentService;
    @PostMapping(value = "/login")//String username,String password
    public String login(@RequestBody Student student){
        System.out.println("login");
        System.out.println(student.getUsername());
        System.out.println(student.getPassword());
        return studentService.login(student.getUsername(),student.getPassword());
    }

    @PostMapping(value = "/register")//String username,String password,String school,String studentNumber
    public String register(@RequestBody Student student){
        return studentService.register(student.getUsername(),student.getPassword(),student.getSchool(),student.getStudentNumber());
    }
    @RequestMapping(value = "/commnet")
    public String comment(@RequestBody CommentVO commentVO){
        return commentService.comment(commentVO);
    }
}
