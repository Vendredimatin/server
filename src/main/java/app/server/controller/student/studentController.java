package app.server.controller.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @RequestMapping("/login")
    public String login(String username,String password){
        return "Success";
    }

    @RequestMapping("/register")
    public String register(String username,String password,String school,String studentNumber){
        return null;
    }
}
