/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 07:46:16 CST 2019
 */

package app.server.vo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentVOTest{
    @Test(timeout = 4000)
    public void test00() {
        CommentVO commentVO0 = new CommentVO();
        assertFalse(commentVO0.isLike());

        commentVO0.setLike(true);
        boolean boolean0 = commentVO0.isLike();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setTime("T");
        commentVO0.getTime();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test02() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setScoreList(null);
        commentVO0.getScoreList();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test03() {
        CommentVO commentVO0 = new CommentVO();
        List<Double> arrayList0 = commentVO0.getScoreList();
        Double integer0 = (double) 0;
        arrayList0.add(integer0);
        commentVO0.getScoreList();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test04() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setLikes(1);
        int int0 = commentVO0.getLikes();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test05() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setLikes((-1));
        int int0 = commentVO0.getLikes();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test06() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setId(1);
        int int0 = commentVO0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test07() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setId((-1));
        int int0 = commentVO0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test08() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setCourseId("B");
        commentVO0.getCourseId();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test09() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setCommenter("v");
        commentVO0.getCommenter();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test10() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setContent("I");
        commentVO0.getContent();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test11() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setAnswerTo(-1);
        commentVO0.getAnswerTo();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test12() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setAnswerTo(1);
        commentVO0.getAnswerTo();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test13() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.getCommenter();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test14() {
        CommentVO commentVO0 = new CommentVO();
        boolean boolean0 = commentVO0.isLike();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test15() {
        CommentVO commentVO0 = new CommentVO();
        int int0 = commentVO0.getId();
        assertFalse(commentVO0.isLike());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test16() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.getAnswerTo();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test17() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setCourseId("");
        commentVO0.getCourseId();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test18() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setContent("");
        commentVO0.getContent();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test19() {
        CommentVO commentVO0 = new CommentVO();
        int int0 = commentVO0.getLikes();
        assertEquals(0, int0);
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test20() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.getContent();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test21() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setCommenter("");
        commentVO0.getCommenter();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test22() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.setTime("");
        commentVO0.getTime();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test23() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.getTime();
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test24() {
        CommentVO commentVO0 = new CommentVO();
        commentVO0.getCourseId();
        assertFalse(commentVO0.isLike());
    }

}