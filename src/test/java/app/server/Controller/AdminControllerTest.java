package app.server.Controller;

import app.server.controller.admin.AdminController;
import app.server.vo.CourseVO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminControllerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        AdminController adminController0 = new AdminController();
        CourseVO courseVO0 = new CourseVO();
        // Undeclared exception!
        adminController0.setCourseAnonymous(courseVO0);

    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        AdminController adminController0 = new AdminController();
        // Undeclared exception!
        adminController0.getUnconfirmList();

    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        AdminController adminController0 = new AdminController();
        // Undeclared exception!
        adminController0.confirmCourse("");

    }
}
