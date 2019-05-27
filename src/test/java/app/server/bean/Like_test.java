package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Like_test {
    @Test(timeout = 4000)
    public void test0() {
        Like like0 = new Like();
        like0.setUsername("X");
        String string0 = like0.getUsername();
        assertEquals("X", string0);
    }

    @Test(timeout = 4000)
    public void test1() {
        Like like0 = new Like();
        like0.setId(1);
        int int0 = like0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test2() {
        Like like0 = new Like();
        like0.setId((-1));
        int int0 = like0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test3() {
        Like like0 = new Like();
        like0.setCommentId(1);
        int int0 = like0.getCommentId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test4() {
        Like like0 = new Like();
        like0.setCommentId((-1));
        int int0 = like0.getCommentId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test5() {
        Like like0 = new Like();
        int int0 = like0.getCommentId();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test6() {
        Like like0 = new Like();
        int int0 = like0.getId();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test7() {
        Like like0 = new Like();
        String string0 = like0.getUsername();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test8() {
        Like like0 = new Like();
        like0.setUsername("");
        String string0 = like0.getUsername();
        assertEquals("", string0);
    }
}
