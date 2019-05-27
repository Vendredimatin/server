package app.server.impl;

import app.server.bean.Course;
import app.server.constants.Constants;
import app.server.service.CourseService;
import app.server.vo.CourseVO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.scanner.Constant;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Course_implTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test00() {
        CourseVO courseVO0 = new CourseVO();
        assertFalse(courseVO0.isCollect());

        courseVO0.setCollect(true);
        boolean boolean0 = courseVO0.isCollect();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() {
        CourseVO courseVO0 = new CourseVO();
        assertFalse(courseVO0.isAnonymous());

        courseVO0.setAnonymous(true);
        boolean boolean0 = courseVO0.isAnonymous();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setId("C");
        courseVO0.getId();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test03() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setId("");
        courseVO0.getId();
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test04() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setTeacherName("1");
        courseVO0.getTeacherName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test05() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setTeacherName("");
        courseVO0.getTeacherName();
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test06() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setScoreList(null);
        courseVO0.getScoreList();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test07() {
        CourseVO courseVO0 = new CourseVO();
        ArrayList<Double> arrayList0 = new ArrayList<>();
        Double integer0 = (double) 0;
        arrayList0.add(integer0);
        courseVO0.setScoreList(arrayList0);
        courseVO0.getScoreList();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test08() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setName("A");
        courseVO0.getName();
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test09() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setName("");
        courseVO0.getName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test10() {
        CourseVO courseVO0 = new CourseVO();
        boolean boolean0 = courseVO0.isAnonymous();
        assertFalse(boolean0);
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test11() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.getTeacherName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test12() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.getId();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test13() {
        CourseVO courseVO0 = new CourseVO();
        List<Double> arrayList0 = courseVO0.getScoreList();
        courseVO0.setScoreList(arrayList0);
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test14() {
        CourseVO courseVO0 = new CourseVO();
        boolean boolean0 = courseVO0.isCollect();
        assertFalse(boolean0);
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test15() {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.getName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Autowired
    CourseService courseService;

    @Test(timeout = 4000)
    public void test16(){
        String s = courseService.setCourseAnonymous("1",true);
        Assert.assertEquals(Constants.SUC,s);
    }

    @Test(timeout = 4000)
    public void test17(){
        String s = courseService.collect("1","1");
        Assert.assertEquals(Constants.SUC,s);
    }

    @Test(timeout = 4000)
    public void test18(){
        String s = courseService.cancelCollect("1","2");
        Assert.assertEquals(Constants.SUC,s);
    }

    @Test(timeout = 4000)
    public void getCoursesTest(){
        CourseVO res = courseService.getCourseById("1","lhy");
        Assert.assertEquals("1",res.getId());
    }
}
