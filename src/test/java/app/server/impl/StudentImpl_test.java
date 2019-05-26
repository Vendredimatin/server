package app.server.impl;

import app.server.service.impl.StudentImpl;
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
public class StudentImpl_test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.updateStudentPassword("", "", "");

    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.updateStudentInfo("", "", "", "", "");

    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.register("", "", "", "", "", "");

    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.login("", "");

    }
}