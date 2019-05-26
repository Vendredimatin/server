package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
public class Like_test {
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Like like0 = new Like();
        like0.setUsername("5");
        String string0 = like0.getUsername();
        assertEquals("5", string0);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Like like0 = new Like();
        like0.setUsername("");
        String string0 = like0.getUsername();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Like like0 = new Like();
        like0.setId(1);
        int int0 = like0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Like like0 = new Like();
        like0.setId((-1));
        int int0 = like0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        Like like0 = new Like();
        like0.setCommentId(1);
        int int0 = like0.getCommentId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        Like like0 = new Like();
        like0.setCommentId((-1));
        int int0 = like0.getCommentId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        Like like0 = new Like();
        int int0 = like0.getCommentId();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        Like like0 = new Like();
        int int0 = like0.getId();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        Like like0 = new Like();
        String string0 = like0.getUsername();
        assertNull(string0);
    }
}
