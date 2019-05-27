package app.server;

import app.server.bean.Collect;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0() {
        Collect collect0 = new Collect();
        collect0.setId(1);
        int int0 = collect0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test1() {
        Collect collect0 = new Collect();
        collect0.setId((-1));
        int int0 = collect0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test2() {
        Collect collect0 = new Collect();
        collect0.setUsername("y");
        String string0 = collect0.getUsername();
        assertEquals("y", string0);
    }

    @Test(timeout = 4000)
    public void test3() {
        Collect collect0 = new Collect();
        collect0.setCourseId("y");
        String string0 = collect0.getCourseId();
        assertEquals("y", string0);
    }

    @Test(timeout = 4000)
    public void test4() {
        Collect collect0 = new Collect();
        collect0.setCourseId("");
        String string0 = collect0.getCourseId();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test5() {
        Collect collect0 = new Collect();
        int int0 = collect0.getId();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test6() {
        Collect collect0 = new Collect();
        String string0 = collect0.getUsername();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test7() {
        Collect collect0 = new Collect();
        collect0.setUsername("");
        String string0 = collect0.getUsername();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test8() {
        Collect collect0 = new Collect();
        String string0 = collect0.getCourseId();
        assertNull(string0);
    }



}
