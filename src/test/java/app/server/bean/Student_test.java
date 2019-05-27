package app.server.bean;

import app.server.dao.StudentDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Student_test {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        student0.setUsername("0");
        String string0 = student0.getUsername();
        assertEquals("0", string0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Student student0 = new Student("", "", "", (String) null, (String) null, "");
        student0.setUsername("");
        String string0 = student0.getUsername();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Student student0 = new Student((String) null, "", "", "", (String) null, (String) null);
        student0.setStudentNumber("1");
        String string0 = student0.getStudentNumber();
        assertEquals("1", string0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        student0.setSchool("T");
        String string0 = student0.getSchool();
        assertEquals("T", string0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setPassword("&");
        String string0 = student0.getPassword();
        assertEquals("&", string0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        student0.setMajor("O");
        String string0 = student0.getMajor();
        assertEquals("O", string0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setMajor("");
        String string0 = student0.getMajor();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Student student0 = new Student("", "", "", (String) null, (String) null, "");
        student0.setCollege("F");
        String string0 = student0.getCollege();
        assertEquals("F", string0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        String string0 = student0.getStudentNumber();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        String string0 = student0.getMajor();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Student student0 = new Student("", "", "", (String) null, (String) null, "");
        String string0 = student0.getUsername();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Student student0 = new Student("", "", "", (String) null, (String) null, "");
        student0.setSchool("");
        String string0 = student0.getSchool();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Student student0 = new Student("", "", "", (String) null, (String) null, "");
        String string0 = student0.getSchool();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Student student0 = new Student("", "", "", (String) null, (String) null, "");
        student0.setStudentNumber("");
        String string0 = student0.getStudentNumber();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        student0.setPassword("");
        String string0 = student0.getPassword();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        student0.setCollege("");
        String string0 = student0.getCollege();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        Student student0 = new Student("", "", (String) null, "", "", "");
        String string0 = student0.getCollege();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getPassword();
        assertNull(string0);
    }

    @Autowired
    StudentDAO studentDAO;
    @Test
    public void test18(){
        Student student = studentDAO.getByUsername("2");
        System.out.println(student);
    }

    @Test
    public void test19(){
        Student student = new Student();
        student.setUsername("2");
        studentDAO.save(student);
    }


}
