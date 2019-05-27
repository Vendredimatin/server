/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 07:45:30 CST 2019
 */

package app.server.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import app.server.vo.CommentVO;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VtoPTest{
    @Rule
    public ExpectedException thrown = ExpectedException.none();

  @Test(timeout = 4000)
  public void test0() {
      thrown.expect(NullPointerException.class);
      VtoP vtoP0 = VtoP.vtoP;
      // Undeclared exception!
      vtoP0.getComment(null);

  }

  @Test(timeout = 4000)
  public void test1() {
      thrown.expect(IndexOutOfBoundsException.class);
      CommentVO commentVO0 = new CommentVO();
      VtoP vtoP0 = VtoP.vtoP;
      // Undeclared exception!
      vtoP0.getComment(commentVO0);

  }
}