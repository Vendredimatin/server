/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 09:11:08 GMT 2019
 */

package app.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import app.server.ServerApplication;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServerApplication_ESTest extends ServerApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "(a6M2z<k:";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        ServerApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServerApplication serverApplication0 = new ServerApplication();
      String[] stringArray0 = new String[6];
      stringArray0[0] = ";PCKw/DcA}2{(";
      stringArray0[1] = "";
      stringArray0[2] = "f";
      stringArray0[3] = "N4&@{gi";
      stringArray0[4] = "";
      stringArray0[5] = "";
      // Undeclared exception!
      try { 
        ServerApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }
}