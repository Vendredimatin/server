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
public class CollectTest {

    @Test(timeout = 4000)
    public void test0() {
        Collect collect0 = new Collect();
        collect0.setUsername("H");
        String string0 = collect0.getUsername();
        assertEquals("H", string0);
    }

    @Test(timeout = 4000)
    public void test1() {
        Collect collect0 = new Collect();
        collect0.setId(1);
        int int0 = collect0.getId();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test2() {
        Collect collect0 = new Collect();
        collect0.setId((-1));
        int int0 = collect0.getId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test3() {
        Collect collect0 = new Collect();
        collect0.setCourseId("m");
        String string0 = collect0.getCourseId();
        assertEquals("m", string0);
    }

    @Test(timeout = 4000)
    public void test4() {
        Collect collect0 = new Collect();
        String string0 = collect0.getUsername();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test5() {
        Collect collect0 = new Collect();
        collect0.setCourseId("");
        String string0 = collect0.getCourseId();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test6() {
        Collect collect0 = new Collect();
        String string0 = collect0.getCourseId();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test7() {
        Collect collect0 = new Collect();
        int int0 = collect0.getId();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test8() {
        Collect collect0 = new Collect();
        collect0.setUsername("");
        String string0 = collect0.getUsername();
        assertEquals("", string0);
    }
}
