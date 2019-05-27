package app.server.impl;

import app.server.service.CommentService;
import app.server.service.impl.CommentImpl;
import app.server.vo.CommentVO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentImpl_test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0() {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.getCourseComment("", "");

    }

    @Test(timeout = 4000)
    public void test1() {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.comment(null);

    }

    @Test(timeout = 4000)
    public void test2() {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.cancelLike("", 0);

    }

    @Test(timeout = 4000)
    public void test3() {
        thrown.expect(IndexOutOfBoundsException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        CommentVO commentVO0 = new CommentVO();
        // Undeclared exception!
        commentImpl0.comment(commentVO0);
    }

    @Test(timeout = 4000)
    public void test4() {
        thrown.expect(NullPointerException.class);
        CommentImpl commentImpl0 = new CommentImpl();
        // Undeclared exception!
        commentImpl0.like("", 0);

    }


    @Autowired
    CommentService commentService;
}
