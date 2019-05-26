package app.server.bean;

import app.server.dao.CourseDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Course_test {
    @Autowired
    CourseDAO courseDAO;

    @Test
    public void test1(){
        Course course = new Course();
        course.setId("1");
        course.setName("1");
        course.setTeacherName("2");
        RatingDetails ratingDetails = new RatingDetails(1,2,3,4,5);
        course.setRatingDetails(ratingDetails);
        courseDAO.save(course);
    }

    @Test
    public void test2(){
        Course course = courseDAO.getOne("1");
        System.out.println(course.toString());
    }
}
