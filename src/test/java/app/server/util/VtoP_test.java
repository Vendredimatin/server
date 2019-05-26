package app.server.util;

import app.server.bean.Comment;
import app.server.vo.CommentVO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

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
public class VtoP_test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        VtoP vtoP0 = VtoP.vtoP;
        CommentVO commentVO0 = new CommentVO();
        ArrayList<Integer> arrayList0 = commentVO0.getScoreList();
        Integer integer0 = new Integer(1);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        Comment comment0 = vtoP0.getComment(commentVO0);
        assertEquals(0, comment0.getLikes());
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        VtoP vtoP0 = VtoP.vtoP;
        CommentVO commentVO0 = new CommentVO();
        ArrayList<Integer> arrayList0 = commentVO0.getScoreList();
        Integer integer0 = new Integer((-1));
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        Comment comment0 = vtoP0.getComment(commentVO0);
        assertNull(comment0.getComment());
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        VtoP vtoP0 = VtoP.vtoP;
        CommentVO commentVO0 = new CommentVO();
        ArrayList<Integer> arrayList0 = commentVO0.getScoreList();
        Integer integer0 = new Integer(0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        commentVO0.setLikes(1);
        arrayList0.add(integer0);
        Comment comment0 = vtoP0.getComment(commentVO0);
        assertEquals(0, comment0.getId());
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        VtoP vtoP0 = VtoP.vtoP;
        CommentVO commentVO0 = new CommentVO();
        ArrayList<Integer> arrayList0 = commentVO0.getScoreList();
        Integer integer0 = new Integer(0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        arrayList0.add(integer0);
        commentVO0.setLikes((-1));
        arrayList0.add(integer0);
        Comment comment0 = vtoP0.getComment(commentVO0);
        assertEquals(0, comment0.getId());
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        thrown.expect(NullPointerException.class);
        VtoP vtoP0 = VtoP.vtoP;
        // Undeclared exception!
        vtoP0.getComment((CommentVO) null);

    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        thrown.expect(IndexOutOfBoundsException.class);
        CommentVO commentVO0 = new CommentVO();
        VtoP vtoP0 = VtoP.vtoP;
        // Undeclared exception!
        vtoP0.getComment(commentVO0);

    }
}
