package app.server;

import app.server.bean.Collect;
import app.server.service.impl.StudentImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Collect collect0 = new Collect();
        collect0.setID(1);
        int int0 = collect0.getID();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Collect collect0 = new Collect();
        collect0.setID((-1));
        int int0 = collect0.getID();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Collect collect0 = new Collect();
        collect0.setUsername("y");
        String string0 = collect0.getUsername();
        assertEquals("y", string0);
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Collect collect0 = new Collect();
        collect0.setCourseId("y");
        String string0 = collect0.getCourseId();
        assertEquals("y", string0);
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        Collect collect0 = new Collect();
        collect0.setCourseId("");
        String string0 = collect0.getCourseId();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        Collect collect0 = new Collect();
        int int0 = collect0.getID();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        Collect collect0 = new Collect();
        String string0 = collect0.getUsername();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        Collect collect0 = new Collect();
        collect0.setUsername("");
        String string0 = collect0.getUsername();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        Collect collect0 = new Collect();
        String string0 = collect0.getCourseId();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        try {
            studentImpl0.updateStudentPassword("", "", "");
            fail("Expecting exception: NoClassDefFoundError");

        } catch(NoClassDefFoundError e) {
            //
            // main/java/dao/StudentDAO
            //
            verifyException("service.impl.StudentImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        try {
            studentImpl0.updateStudentInfo("", "", "", "", "");
            fail("Expecting exception: NoClassDefFoundError");

        } catch(NoClassDefFoundError e) {
            //
            // main/java/dao/StudentDAO
            //
            verifyException("service.impl.StudentImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        try {
            studentImpl0.register("", "", "", "", "", "");
            fail("Expecting exception: NoClassDefFoundError");

        } catch(NoClassDefFoundError e) {
            //
            // main/java/dao/StudentDAO
            //
            verifyException("service.impl.StudentImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable {
        StudentImpl studentImpl0 = new StudentImpl();
        // Undeclared exception!
        try {
            studentImpl0.login("", "");
            fail("Expecting exception: NoClassDefFoundError");

        } catch (NoClassDefFoundError e) {
            //
            // main/java/dao/StudentDAO
            //
            verifyException("service.impl.StudentImpl", e);
        }
    }

}
