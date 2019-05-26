package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Course_test {
    @Test(timeout = 4000)
    public void test00() {
        Course course0 = new Course();
        course0.setTeacherName("O");
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test01() {
        Course course0 = new Course();
        course0.setScore5(1);
        int int0 = course0.getScore5();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test02() {
        Course course0 = new Course();
        course0.setScore5((-1));
        int int0 = course0.getScore5();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test03() {
        Course course0 = new Course();
        course0.setScore4(1);
        int int0 = course0.getScore4();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test04() {
        Course course0 = new Course();
        course0.setScore4((-1));
        int int0 = course0.getScore4();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test05() {
        Course course0 = new Course();
        course0.setScore3(1);
        int int0 = course0.getScore3();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test06() {
        Course course0 = new Course();
        course0.setScore3((-1));
        int int0 = course0.getScore3();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test07() {
        Course course0 = new Course();
        course0.setScore2(1);
        int int0 = course0.getScore2();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test08() {
        Course course0 = new Course();
        course0.setScore2((-1));
        int int0 = course0.getScore2();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test09() {
        Course course0 = new Course();
        course0.setScore1(1);
        int int0 = course0.getScore1();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test10() {
        Course course0 = new Course();
        course0.setScore1((-1));
        int int0 = course0.getScore1();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test11() {
        Course course0 = new Course();
        course0.setName("P");
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test12() {
        Course course0 = new Course();
        course0.setName("");
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test13() {
        Course course0 = new Course();
        course0.setId("V");
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test14() {
        Course course0 = new Course();
        course0.setTeacherName("");
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test15() {
        Course course0 = new Course();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test16() {
        Course course0 = new Course();
        assertFalse(course0.isAnonymous());

        course0.setAnonymous(true);
        boolean boolean0 = course0.isAnonymous();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test17() {
        Course course0 = new Course();
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test18() {
        Course course0 = new Course();
        boolean boolean0 = course0.isAnonymous();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test19() {
        Course course0 = new Course();
        int int0 = course0.getScore5();
        assertFalse(course0.isAnonymous());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test20() {
        Course course0 = new Course();
        int int0 = course0.getScore4();
        assertFalse(course0.isAnonymous());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test21() {
        Course course0 = new Course();
        int int0 = course0.getScore3();
        assertFalse(course0.isAnonymous());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test22() {
        Course course0 = new Course();
        int int0 = course0.getScore1();
        assertEquals(0, int0);
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test23() {
        Course course0 = new Course();
        course0.setId("");
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test24() {
        Course course0 = new Course();
        int int0 = course0.getScore2();
        assertEquals(0, int0);
        assertFalse(course0.isAnonymous());
    }

    @Test(timeout = 4000)
    public void test25() {
        Course course0 = new Course();
        assertFalse(course0.isAnonymous());
    }
}
