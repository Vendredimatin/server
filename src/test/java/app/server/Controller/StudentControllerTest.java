/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 07:42:04 CST 2019
 */

package app.server.Controller;

import app.server.controller.student.StudentController;
import app.server.service.CommentService;
import app.server.service.CourseService;
import app.server.service.StudentService;
import app.server.vo.*;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.evosuite.shaded.org.mockito.ArgumentMatchers.*;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest{
    @Rule
    public ExpectedException thrown = ExpectedException.none();

  @Test(timeout = 4000)
  public void test00() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(studentService0).updateStudentPassword(anyString() , anyString() , anyString());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      StudentVO studentVO0 = new StudentVO();
      String string0 = studentController0.updateStudentPassword(studentVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("r").when(commentService0).like(anyString() , anyInt());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      LikeVO likeVO0 = new LikeVO();
      likeVO0.setUsername("");
      String string0 = studentController0.like(likeVO0);
      assertEquals("r", string0);
  }

  @Test(timeout = 4000)
  public void test02() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentService0).like(anyString() , anyInt());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      LikeVO likeVO0 = new LikeVO();
      likeVO0.setUsername("");
      String string0 = studentController0.like(likeVO0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      ArrayList<CourseVO> arrayList0 = new ArrayList<>();
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(courseService0).getCollectList(anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      List<CourseVO> list0 = studentController0.getCollectList("");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      ArrayList<CourseVO> arrayList0 = new ArrayList<>();
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(courseService0).getCollectList(anyString());
      CourseVO courseVO0 = new CourseVO();
      arrayList0.add(courseVO0);
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      List<CourseVO> list0 = studentController0.getCollectList("");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(courseService0).createCourse(anyString() , anyString() , anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CourseVO courseVO0 = new CourseVO();
      String string0 = studentController0.createCourse(courseVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("S").when(commentService0).comment(any(CommentVO.class));
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CommentVO commentVO0 = new CommentVO();
      String string0 = studentController0.comment(commentVO0);
      assertEquals("S", string0);
  }

  @Test(timeout = 4000)
  public void test07() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentService0).comment(any(CommentVO.class));
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CommentVO commentVO0 = new CommentVO();
      String string0 = studentController0.comment(commentVO0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn("#").when(courseService0).collect(anyString() , anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setCourseId("");
      collectVO0.setUsername("");
      String string0 = studentController0.collect(collectVO0);
      assertEquals("#", string0);
  }

  @Test(timeout = 4000)
  public void test09() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("l").when(commentService0).cancelLike(anyString() , anyInt());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      LikeVO likeVO0 = new LikeVO();
      likeVO0.setUsername("");
      String string0 = studentController0.cancelLike(likeVO0);
      assertEquals("l", string0);
  }

  @Test(timeout = 4000)
  public void test10() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentService0).cancelLike(anyString() , anyInt());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      LikeVO likeVO0 = new LikeVO();
      likeVO0.setUsername("");
      String string0 = studentController0.cancelLike(likeVO0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn("K").when(courseService0).cancelCollect(anyString() , anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setUsername("");
      collectVO0.setCourseId("");
      String string0 = studentController0.cancelCollect(collectVO0);
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test12() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn("").when(courseService0).cancelCollect(anyString() , anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CollectVO collectVO0 = new CollectVO();
      collectVO0.setCourseId("");
      collectVO0.setUsername("");
      String string0 = studentController0.cancelCollect(collectVO0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, null, null);
      StudentVO studentVO0 = new StudentVO();
      // Undeclared exception!
      studentController0.updateStudentInfo(studentVO0);

  }

  @Test(timeout = 4000)
  public void test14() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, null, courseService0);
      StudentVO studentVO0 = new StudentVO();
      // Undeclared exception!
      studentController0.register(studentVO0);

  }

  @Test(timeout = 4000)
  public void test15() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      // Undeclared exception!
      studentController0.login(null);

  }

  @Test(timeout = 4000)
  public void test16() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      // Undeclared exception!
      studentController0.like(null);

  }

  @Test(timeout = 4000)
  public void test17() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, null);
      // Undeclared exception!
      studentController0.getCollectList("");

  }

  @Test(timeout = 4000)
  public void test18() {
      thrown.expect(NullPointerException.class);
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(null, studentService0, courseService0);
      CommentVO commentVO0 = new CommentVO();
      // Undeclared exception!
      studentController0.comment(commentVO0);

  }

  @Test(timeout = 4000)
  public void test19() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      // Undeclared exception!
      studentController0.collect(null);

  }

  @Test(timeout = 4000)
  public void test20() {
      thrown.expect(NullPointerException.class);
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(null, studentService0, null);
      LikeVO likeVO0 = new LikeVO();
      // Undeclared exception!
      studentController0.cancelLike(likeVO0);

  }

  @Test(timeout = 4000)
  public void test21() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, null);
      CollectVO collectVO0 = new CollectVO();
      // Undeclared exception!
      studentController0.cancelCollect(collectVO0);

  }

  @Test(timeout = 4000)
  public void test22() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(studentService0).register(anyString() , anyString() , anyString() , anyString() , anyString() , anyString());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      StudentVO studentVO0 = new StudentVO();
      String string0 = studentController0.register(studentVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(studentService0).login(anyString() , anyString());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      StudentVO studentVO0 = new StudentVO();
      String string0 = studentController0.login(studentVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(courseService0).collect(anyString() , anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CollectVO collectVO0 = new CollectVO();
      String string0 = studentController0.collect(collectVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(courseService0).getCollectList(anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      List<CourseVO> list0 = studentController0.getCollectList("");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn("").when(commentService0).cancelLike(anyString() , anyInt());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      LikeVO likeVO0 = new LikeVO();
      String string0 = studentController0.cancelLike(likeVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(courseService0).cancelCollect(anyString() , anyString());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CollectVO collectVO0 = new CollectVO();
      String string0 = studentController0.cancelCollect(collectVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(commentService0).comment(any(CommentVO.class));
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      CommentVO commentVO0 = new CommentVO();
      String string0 = studentController0.comment(commentVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(studentService0).updateStudentInfo(anyString() , anyString() , anyString() , anyString() , anyString());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      StudentVO studentVO0 = new StudentVO();
      String string0 = studentController0.updateStudentInfo(studentVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30() {
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      doReturn(null).when(commentService0).like(anyString() , anyInt());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      LikeVO likeVO0 = new LikeVO();
      String string0 = studentController0.like(likeVO0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      // Undeclared exception!
      studentController0.createCourse(null);

  }

  @Test(timeout = 4000)
  public void test32() {
      thrown.expect(NullPointerException.class);
      CommentService commentService0 = mock(CommentService.class, new ViolatedAssumptionAnswer());
      StudentService studentService0 = mock(StudentService.class, new ViolatedAssumptionAnswer());
      CourseService courseService0 = mock(CourseService.class, new ViolatedAssumptionAnswer());
      StudentController studentController0 = new StudentController(commentService0, studentService0, courseService0);
      // Undeclared exception!
      studentController0.updateStudentPassword(null);

  }
}
