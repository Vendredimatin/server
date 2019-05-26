package app.server.util;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Java6Assertions.fail;
import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PtoV_test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        PtoV ptoV0 = PtoV.ptoV;
        Course course0 = new Course();
        course0.setAnonymous(true);
        CourseVO courseVO0 = ptoV0.getCourseVO(course0);
        assertFalse(courseVO0.isCollect());
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        PtoV ptoV0 = PtoV.ptoV;

        Comment comment0 = new Comment();
        comment0.setLikes(1);
        Date date0 = new Date(0L);
        comment0.setTime(date0);
        CommentVO commentVO0 = ptoV0.getCommentVO(comment0);
        assertNull(commentVO0.getCommenter());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        PtoV ptoV0 = PtoV.ptoV;
        Comment comment0 = new Comment();
        Instant instant0 = Instant.EPOCH;
        Date date0 = Date.from(instant0);
        comment0.setTime(date0);
        comment0.setLikes((-1));
        CommentVO commentVO0 = ptoV0.getCommentVO(comment0);
        assertNull(commentVO0.getCourseId());
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Comment comment0 = new Comment();
        Date date0 = new Date();
        comment0.setTime(date0);
        PtoV ptoV0 = PtoV.ptoV;
        CommentVO commentVO0 = ptoV0.getCommentVO(comment0);
        assertFalse(commentVO0.isLike());
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        PtoV ptoV0 = PtoV.ptoV;
        Comment comment0 = new Comment();
        Instant instant0 = Instant.EPOCH;
        Date date0 = Date.from(instant0);
        comment0.setTime(date0);
        comment0.setId(1);
        CommentVO commentVO0 = ptoV0.getCommentVO(comment0);
        assertEquals("1970-01-01 08:00:00", commentVO0.getTime());
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        PtoV ptoV0 = PtoV.ptoV;
        Comment comment0 = new Comment();
        Instant instant0 = Instant.now();
        Date date0 = Date.from(instant0);
        comment0.setTime(date0);
        comment0.setId((-1));
        CommentVO commentVO0 = ptoV0.getCommentVO(comment0);
        assertNull(commentVO0.getAnswerTo());
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        PtoV ptoV0 = PtoV.ptoV;
        // Undeclared exception!
        ptoV0.getCourseVO((Course) null);

    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        Comment comment0 = new Comment();
        PtoV ptoV0 = PtoV.ptoV;
        // Undeclared exception!
        ptoV0.getCommentVO(comment0);

    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        Course course0 = new Course();
        PtoV ptoV0 = PtoV.ptoV;
        CourseVO courseVO0 = ptoV0.getCourseVO(course0);
        assertNull(courseVO0.getName());
    }
}
