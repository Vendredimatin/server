package app.server.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RatingDetaildTest {
    @Test(timeout = 4000)
    public void test00() {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.0, 0.0, 0.5);
        double double0 = ratingDetail0.getScore5();
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.5, double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.0, 0.0, (-0.5825523974609375));
        double double0 = ratingDetail0.getScore5();
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals((-0.5825523974609375), double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() {
        RatingDetail ratingDetail0 = new RatingDetail();
        ratingDetail0.setScore4(0.7538519423378907);
        double double0 = ratingDetail0.getScore4();
        assertEquals(0.7538519423378907, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.0, (-0.8525096751757812), 0.0);
        double double0 = ratingDetail0.getScore4();
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals((-0.8525096751757812), double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.869999263527793, 0.0, 0.0);
        double double0 = ratingDetail0.getScore3();
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.869999263527793, double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, (-0.6024483544921875), 0.0, 0.0);
        double double0 = ratingDetail0.getScore3();
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals((-0.6024483544921875), double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        ratingDetail0.setScore2(0.55078125);
        double double0 = ratingDetail0.getScore2();
        assertEquals(0.55078125, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, (-0.6024483544921875), 0.0, 0.0, 0.0);
        double double0 = ratingDetail0.getScore2();
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals((-0.6024483544921875), double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.0, 0.0, 0.0);
        ratingDetail0.setScore1(0.6025426051953126);
        double double0 = ratingDetail0.getScore1();
        assertEquals(0.6025426051953126, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.0, 0.0, 0.0);
        ratingDetail0.setScore1((-0.8732046719612871));
        double double0 = ratingDetail0.getScore1();
        assertEquals((-0.8732046719612871), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        double double0 = ratingDetail0.getScore5();
        assertEquals(0.0, double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        double double0 = ratingDetail0.getScore4();
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        double double0 = ratingDetail0.getScore1();
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        double double0 = ratingDetail0.getScore2();
        assertEquals(0.0, double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        ratingDetail0.setScore5(0.0);
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        ratingDetail0.setScore3(0.0);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore3(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        RatingDetail ratingDetail0 = new RatingDetail();
        String string0 = ratingDetail0.toString();
        assertEquals("RatingDetail{score1=0.0, score2=0.0, score3=0.0, score4=0.0, score5=0.0}", string0);
    }

    @Test(timeout = 4000)
    public void test17() {
        RatingDetail ratingDetail0 = new RatingDetail(0.0, 0.0, 0.0, 0.0, 0.0);
        double double0 = ratingDetail0.getScore3();
        assertEquals(0.0, ratingDetail0.getScore2(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore4(), 0.01);
        assertEquals(0.0, ratingDetail0.getScore5(), 0.01);
        assertEquals(0.0, double0, 0.01);
        assertEquals(0.0, ratingDetail0.getScore1(), 0.01);
    }
}
