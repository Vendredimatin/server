package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Comment_Test {
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setLikes(1);
        int int0 = comment0.getLikes();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setLikes((-1));
        int int0 = comment0.getLikes();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setId(1);
        int int0 = comment0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setId((-1));
        int int0 = comment0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCourseId("h");
        comment0.getCourseId();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCourseId("");
        comment0.getCourseId();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCommenter("h");
        comment0.getCommenter();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCommentInfo("r");
        comment0.getCommentInfo();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Comment comment0 = new Comment();
        assertEquals((-1), comment0.getAnswerTo());

        comment0.setAnswerTo(1);
        int int0 = comment0.getAnswerTo();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.getTime();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.getCommentInfo();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Comment comment0 = new Comment();
        assertEquals((-1), comment0.getAnswerTo());

        comment0.setAnswerTo(0);
        int int0 = comment0.getAnswerTo();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.getCommenter();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Comment comment0 = new Comment();
        Instant instant0 = Instant.ofEpochSecond(0L);
        Date date0 = Date.from(instant0);
        comment0.setTime(date0);
        comment0.getTime();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCommenter("");
        comment0.getCommenter();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.getRatingDetail();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getLikes();
        assertEquals((-1), comment0.getAnswerTo());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getId();
        assertEquals((-1), comment0.getAnswerTo());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.setCommentInfo("");
        comment0.getCommentInfo();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        Comment comment0 = new Comment();
        comment0.getCourseId();
        assertEquals((-1), comment0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        Comment comment0 = new Comment();
        int int0 = comment0.getAnswerTo();
        assertEquals((-1), int0);
    }

}
