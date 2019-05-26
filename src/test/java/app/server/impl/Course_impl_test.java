package app.server.impl;

import app.server.vo.CourseVO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Course_impl_test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        assertFalse(courseVO0.isCollect());

        courseVO0.setCollect(true);
        boolean boolean0 = courseVO0.isCollect();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        assertFalse(courseVO0.isAnonymous());

        courseVO0.setAnonymous(true);
        boolean boolean0 = courseVO0.isAnonymous();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setID("C");
        courseVO0.getID();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setID("");
        courseVO0.getID();
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setTeacherName("1");
        courseVO0.getTeacherName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setTeacherName("");
        courseVO0.getTeacherName();
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setScoreList((ArrayList<Integer>) null);
        courseVO0.getScoreList();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        Integer integer0 = new Integer(0);
        arrayList0.add(integer0);
        courseVO0.setScoreList(arrayList0);
        courseVO0.getScoreList();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setName("A");
        courseVO0.getName();
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.setName("");
        courseVO0.getName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        boolean boolean0 = courseVO0.isAnonymous();
        assertFalse(boolean0);
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.getTeacherName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.getID();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        ArrayList<Integer> arrayList0 = courseVO0.getScoreList();
        courseVO0.setScoreList(arrayList0);
        assertFalse(courseVO0.isCollect());
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        boolean boolean0 = courseVO0.isCollect();
        assertFalse(boolean0);
        assertFalse(courseVO0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        CourseVO courseVO0 = new CourseVO();
        courseVO0.getName();
        assertFalse(courseVO0.isAnonymous());
        assertFalse(courseVO0.isCollect());
    }
}
