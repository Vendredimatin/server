package app.server.bean;

import app.server.dao.CourseDAO;
import app.server.service.CourseService;
import app.server.vo.CourseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Course_test {
    @Test(timeout = 4000)
    public void test00() {
        Course course0 = new Course();
        assertFalse(course0.isAlive());

        course0.setAlive(true);
        boolean boolean0 = course0.isAlive();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() {
        Course course0 = new Course();
        course0.setTeacherName("U");
        course0.getTeacherName();
        assertFalse(course0.isAlive());
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test02() {
        Course course0 = new Course();
        course0.setName("U");
        course0.getName();
        assertFalse(course0.isAlive());
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test03() {
        Course course0 = new Course();
        course0.setId("7");
        course0.getId();
        assertFalse(course0.isAnonymous());
        assertFalse(course0.isAlive());
    }

    @Test(timeout = 4000)
    public void test04() {
        Course course0 = new Course();
        course0.getRatingDetail();
        assertFalse(course0.isAlive());
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test05() {
        Course course0 = new Course();
        course0.getId();
        assertFalse(course0.isAlive());
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test06() {
        Course course0 = new Course();
        course0.getTeacherName();
        assertFalse(course0.isAnonymous());
        assertFalse(course0.isAlive());
    }

    @Test(timeout = 4000)
    public void test07() {
        Course course0 = new Course();
        course0.getName();
        assertFalse(course0.isAnonymous());
        assertFalse(course0.isAlive());
    }

    @Test(timeout = 4000)
    public void test08() {
        Course course0 = new Course();
        course0.setTeacherName("");
        course0.getTeacherName();
        assertFalse(course0.isAnonymous());
        assertFalse(course0.isAlive());
    }

    @Test(timeout = 4000)
    public void test09() {
        Course course0 = new Course();
        assertFalse(course0.isAnonymous());

        course0.setAnonymous(true);
        boolean boolean0 = course0.isAnonymous();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test10() {
        Course course0 = new Course();
        course0.setId("");
        course0.getId();
        assertFalse(course0.isAlive());
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test11() {
        Course course0 = new Course();
        boolean boolean0 = course0.isAlive();
        assertFalse(course0.isAnonymous());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12() {
        Course course0 = new Course();
        boolean boolean0 = course0.isAnonymous();
        assertFalse(boolean0);
        assertFalse(course0.isAlive());
    }

    @Test(timeout = 4000)
    public void test13() {
        Course course0 = new Course();
        course0.setName("");
        course0.getName();
        assertFalse(course0.isAlive());
        assertFalse(course0.isAnonymous());
    }

    @Autowired
    CourseService courseService;

    @Test
    public void test14(){
        courseService.createCourse("4","1","1");
    }

    @Test
    public void test15(){
        List<CourseVO> courseVOList = courseService.getCourses("");
    }
}
