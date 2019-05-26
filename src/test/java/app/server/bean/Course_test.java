package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Course_test {
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Course course0 = new Course();
        course0.setTeacherName("O");
        course0.getTeacherName();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore5(1);
        int int0 = course0.getScore5();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore5((-1));
        int int0 = course0.getScore5();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore4(1);
        int int0 = course0.getScore4();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore4((-1));
        int int0 = course0.getScore4();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore3(1);
        int int0 = course0.getScore3();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore3((-1));
        int int0 = course0.getScore3();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore2(1);
        int int0 = course0.getScore2();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore2((-1));
        int int0 = course0.getScore2();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore1(1);
        int int0 = course0.getScore1();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Course course0 = new Course();
        course0.setScore1((-1));
        int int0 = course0.getScore1();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Course course0 = new Course();
        course0.setName("P");
        course0.getName();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Course course0 = new Course();
        course0.setName("");
        course0.getName();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Course course0 = new Course();
        course0.setID("V");
        course0.getID();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Course course0 = new Course();
        course0.setTeacherName("");
        course0.getTeacherName();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        Course course0 = new Course();
        course0.getName();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        Course course0 = new Course();
        assertFalse(course0.isAnonymous());

        course0.setAnonymous(true);
        boolean boolean0 = course0.isAnonymous();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Course course0 = new Course();
        course0.getID();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Course course0 = new Course();
        boolean boolean0 = course0.isAnonymous();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        Course course0 = new Course();
        int int0 = course0.getScore5();
        assertFalse(course0.isAnonymous());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        Course course0 = new Course();
        int int0 = course0.getScore4();
        assertFalse(course0.isAnonymous());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        Course course0 = new Course();
        int int0 = course0.getScore3();
        assertFalse(course0.isAnonymous());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        Course course0 = new Course();
        int int0 = course0.getScore1();
        assertEquals(0, int0);
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        Course course0 = new Course();
        course0.setID("");
        course0.getID();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        Course course0 = new Course();
        int int0 = course0.getScore2();
        assertEquals(0, int0);
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        Course course0 = new Course();
        course0.getTeacherName();
        assertFalse(course0.isAnonymous());
    }
}
