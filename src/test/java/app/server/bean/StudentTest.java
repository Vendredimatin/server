package app.server.bean;

import app.server.dao.StudentDAO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test00() {
        Student student0 = new Student("", "", null, "", "", "");
        student0.setUsername("0");
        String string0 = student0.getUsername();
        assertEquals("0", string0);
    }

    @Test(timeout = 4000)
    public void test01() {
        Student student0 = new Student("", "", "", null, null, "");
        student0.setUsername("");
        String string0 = student0.getUsername();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test02() {
        Student student0 = new Student(null, "", "", "", (String) null, null);
        student0.setStudentNumber("1");
        String string0 = student0.getStudentNumber();
        assertEquals("1", string0);
    }

    @Test(timeout = 4000)
    public void test03() {
        Student student0 = new Student("", "", null, "", "", "");
        student0.setSchool("T");
        String string0 = student0.getSchool();
        assertEquals("T", string0);
    }

    @Test(timeout = 4000)
    public void test04() {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setPassword("&");
        String string0 = student0.getPassword();
        assertEquals("&", string0);
    }

    @Test(timeout = 4000)
    public void test05() {
        Student student0 = new Student("", "", null, "", "", "");
        student0.setMajor("O");
        String string0 = student0.getMajor();
        assertEquals("O", string0);
    }

    @Test(timeout = 4000)
    public void test06() {
        Student student0 = new Student("", "", "", "", "", "");
        student0.setMajor("");
        String string0 = student0.getMajor();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test07() {
        Student student0 = new Student("", "", "", null, null, "");
        student0.setCollege("F");
        String string0 = student0.getCollege();
        assertEquals("F", string0);
    }

    @Test(timeout = 4000)
    public void test08() {
        Student student0 = new Student("", "", null, "", "", "");
        String string0 = student0.getStudentNumber();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test09() {
        Student student0 = new Student("", "", null, "", "", "");
        String string0 = student0.getMajor();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test10() {
        Student student0 = new Student("", "", "", null, null, "");
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
    public void test12() {
        Student student0 = new Student("", "", "", null, null, "");
        String string0 = student0.getSchool();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test13() {
        Student student0 = new Student("", "", "", null, null, "");
        student0.setStudentNumber("");
        String string0 = student0.getStudentNumber();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test14() {
        Student student0 = new Student("", "", null, "", "", "");
        student0.setPassword("");
        String string0 = student0.getPassword();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test15() {
        Student student0 = new Student("", "", null, "", "", "");
        student0.setCollege("");
        String string0 = student0.getCollege();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test16() {
        Student student0 = new Student("", "", null, "", "", "");
        String string0 = student0.getCollege();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test17() {
        Student student0 = new Student("", "", "", "", "", "");
        String string0 = student0.getPassword();
        assertNull(string0);
    }

    @Autowired
    StudentDAO studentDAO;


    @Test
    public void test19(){
        Student student = new Student();
        student.setUsername("2");
        studentDAO.save(student);
    }


}
