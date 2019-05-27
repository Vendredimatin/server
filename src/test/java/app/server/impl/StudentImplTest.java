package app.server.impl;

import app.server.bean.Student;
import app.server.constants.Constants;
import app.server.service.StudentService;
import app.server.service.impl.StudentImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentImplTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test01() {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.updateStudentPassword("", "", "");

    }

    @Test(timeout = 4000)
    public void test11() {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.updateStudentInfo("", "", "", "", "");

    }

    @Test(timeout = 4000)
    public void test21() {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.register("", "", "", "", "", "");

    }

    @Test(timeout = 4000)
    public void test31() {
        thrown.expect(NullPointerException.class);
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        studentImpl0.login("", "");

    }

    @Autowired
    StudentService studentService;

    //test login
    @Test(timeout = 4000)
    public void test41(){
        String s = studentService.login("lhy","123456");
        Assert.assertEquals(Constants.SUC,s);
    }

    //test register
    @Test(timeout = 4000)
    public void test51(){
        String res = studentService.register("zyj","123456","nju","software","1","1");
        Assert.assertEquals(Constants.SUC,res);

    }

    @Test(timeout = 4000)
    public void test61(){
        String res = studentService.updateStudentInfo("lhy","1234567","zju","software","1");
        Assert.assertEquals(Constants.SUC,res);
    }

    @Test(timeout = 4000)
    public void test71(){
        Student student = studentService.getStudentInfo("lhy");
        Assert.assertEquals("software",student.getMajor());
    }

    @Test(timeout = 4000)
    public void test72(){
        String student = studentService.updateStudentPassword("zyj","123456","123456");
        Assert.assertEquals(Constants.SUC,student);
    }
}
