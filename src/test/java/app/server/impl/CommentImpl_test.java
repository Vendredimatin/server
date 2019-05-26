package app.server.impl;

import app.server.service.impl.CommentImpl;
import app.server.vo.CommentVO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.fail;
import static org.evosuite.runtime.EvoAssertions.verifyException;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentImpl_test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.getCourseComment("", "");

    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.comment((CommentVO) null);

    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.cancelLike("", 0);

    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        thrown.expect(IndexOutOfBoundsException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        CommentVO commentVO0 = new CommentVO();
        // Undeclared exception!
        commentImpl0.comment(commentVO0);
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.like("", 0);

    }
}
