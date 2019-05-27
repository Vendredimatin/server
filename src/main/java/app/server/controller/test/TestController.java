package app.server.controller.test;

import app.server.service.CFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    CFService cfService;

    @RequestMapping("/test")
    public void test(){
        cfService.getRecommendCourses("test");
    }
}
