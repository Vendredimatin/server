package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Student_test {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setUsername("U");
        String string0 = student0.getUsername();
        assertEquals("U", string0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setStudentNumber("N");
        String string0 = student0.getStudentNumber();
        assertEquals("N", string0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setSchool("H");
        String string0 = student0.getSchool();
        assertEquals("H", string0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setPassword("z");
        String string0 = student0.getPassword();
        assertEquals("z", string0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setPassword("");
        String string0 = student0.getPassword();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setMajor("U");
        String string0 = student0.getMajor();
        assertEquals("U", string0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setCollege("E");
        String string0 = student0.getCollege();
        assertEquals("E", string0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setCollege("");
        String string0 = student0.getCollege();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setMajor("");
        String string0 = student0.getMajor();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getUsername();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setSchool("");
        String string0 = student0.getSchool();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getStudentNumber();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setStudentNumber("");
        String string0 = student0.getStudentNumber();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setUsername("");
        String string0 = student0.getUsername();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getPassword();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getCollege();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getMajor();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", (String) null);
        String string0 = student0.getSchool();
        assertNull(string0);
    }
}
