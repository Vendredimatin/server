package app.server.controller.student;

import app.server.bean.Student;
import app.server.vo.CommentVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)//String username,String password
    public String login(@RequestBody Student student){
        System.out.println("login");
        return "Success";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)//String username,String password,String school,String studentNumber
    public String register(@RequestBody Student student){
        return null;
    }
    @RequestMapping(value = "/commnet",method = RequestMethod.POST)
    public String comment(@RequestBody CommentVO commentVO){
        return null;
    }
}
