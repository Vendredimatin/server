package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

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
public class Comment_Test {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore5(1);
        int int0 = comment0.getScore5();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore5((-1));
        int int0 = comment0.getScore5();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore4(1);
        int int0 = comment0.getScore4();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore4((-1));
        int int0 = comment0.getScore4();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore3(1);
        int int0 = comment0.getScore3();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore3((-1));
        int int0 = comment0.getScore3();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore2(1);
        int int0 = comment0.getScore2();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore2((-1));
        int int0 = comment0.getScore2();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore1(1);
        int int0 = comment0.getScore1();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setScore1((-1));
        int int0 = comment0.getScore1();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setLikes(1);
        int int0 = comment0.getLikes();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setLikes((-1));
        int int0 = comment0.getLikes();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setId(1);
        int int0 = comment0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setId((-1));
        int int0 = comment0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCourseId("1");
        String string0 = comment0.getCourseId();
        assertEquals("1", string0);
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCourseId("");
        String string0 = comment0.getCourseId();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCommenter("u");
        String string0 = comment0.getCommenter();
        assertEquals("u", string0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setComment("6");
        String string0 = comment0.getComment();
        assertEquals("6", string0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setAnswerTo("N");
        String string0 = comment0.getAnswerTo();
        assertEquals("N", string0);
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setAnswerTo("");
        String string0 = comment0.getAnswerTo();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getLikes();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getScore1();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        Comment comment0 = new Comment();
        String string0 = comment0.getComment();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        Comment comment0 = new Comment();
        String string0 = comment0.getAnswerTo();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getScore5();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getScore3();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        Comment comment0 = new Comment();
        String string0 = comment0.getCourseId();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getScore2();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test28()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCommenter("");
        String string0 = comment0.getCommenter();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        Comment comment0 = new Comment();
        Date date0 = new Date(0L);
        comment0.setTime(date0);
        Date date1 = comment0.getTime();
        assertEquals("Thu Jan 01 08:00:00 CST 1970", date1.toString());
    }

    @Test(timeout = 4000)
    public void test30()  throws Throwable  {
        Comment comment0 = new Comment();
        String string0 = comment0.getCommenter();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setComment("");
        String string0 = comment0.getComment();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test32()  throws Throwable  {
        Comment comment0 = new Comment();
        Date date0 = comment0.getTime();
        assertNull(date0);
    }

    @Test(timeout = 4000)
    public void test33()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getScore4();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test34()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getId();
        assertEquals(0, int0);
    }
}
