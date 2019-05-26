/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 07:51:59 GMT 2019
 */

package app.server.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import app.server.util.VtoP;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VtoP_ESTest extends VtoP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      VtoP vtoP0 = VtoP.vtoP;
      Integer integer0 = new Integer(786);
      linkedList0.offer(integer0);
      linkedList0.add(integer0);
      CourseVO courseVO0 = new CourseVO("h~X%fiF", "", "h~X%fiF", linkedList0, false);
      // Undeclared exception!
      try { 
        vtoP0.getCourse(courseVO0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      VtoP vtoP0 = VtoP.vtoP;
      Integer integer0 = Integer.valueOf(0);
      linkedList0.add(integer0);
      linkedList0.add(integer0);
      CommentVO commentVO0 = new CommentVO((String) null, "h~X%fiF", "", "", linkedList0);
      // Undeclared exception!
      try { 
        vtoP0.getComment(commentVO0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        VtoP.vtoP.getCourse((CourseVO) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("app.server.util.VtoP", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VtoP vtoP0 = VtoP.vtoP;
      // Undeclared exception!
      try { 
        vtoP0.getComment((CommentVO) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("app.server.util.VtoP", e);
      }
  }
}
