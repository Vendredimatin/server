package app.server.controller;

import app.server.controller.pub.PubController;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author：Liu hanni
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PubControllerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0() {
        thrown.expect(NullPointerException.class);
        PubController pubController0 = new PubController();
        // Undeclared exception!
        pubController0.getCourses("");
    }

    @Test(timeout = 4000)
    public void test1() {
        thrown.expect(NullPointerException.class);
        PubController pubController0 = new PubController();
        // Undeclared exception!
        pubController0.getCourseComment("", "");

    }

    @Test(timeout = 4000)
    public void test2() {
        thrown.expect(NullPointerException.class);
        PubController pubController0 = new PubController();
        // Undeclared exception!
        pubController0.getCourseById("", "");

    }
}
