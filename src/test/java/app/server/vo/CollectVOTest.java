/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 07:45:39 CST 2019
 */

package app.server.vo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectVOTest {

  @Test(timeout = 4000)
  public void test0() {
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setUsername("w");
      String string0 = collectVO0.getUsername();
      assertEquals("w", string0);
  }

  @Test(timeout = 4000)
  public void test1() {
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setCourseId("w");
      String string0 = collectVO0.getCourseId();
      assertEquals("w", string0);
  }

  @Test(timeout = 4000)
  public void test2() {
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setUsername("");
      String string0 = collectVO0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3() {
      CollectVO collectVO0 = new CollectVO();
      String string0 = collectVO0.getCourseId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4() {
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setCourseId("");
      String string0 = collectVO0.getCourseId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5() {
      CollectVO collectVO0 = new CollectVO();
      String string0 = collectVO0.getUsername();
      assertNull(string0);
  }
}
