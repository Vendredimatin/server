package app.server.util;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;

import java.util.Date;
import java.util.List;

public class VtoP {
    public static VtoP vtoP = new VtoP();
    private VtoP(){};
    public Comment getComment(CommentVO vo){
        Comment comment = new Comment();
        comment.setComment(vo.getComment());
        comment.setCommenter(vo.getCommenter());
        comment.setCourseId(vo.getCourseId());
        List<Integer> scores = vo.getScoreList();
        comment.setScore1(scores.get(0));
        comment.setScore2(scores.get(1));
        comment.setScore3(scores.get(2));
        comment.setScore4(scores.get(3));
        comment.setScore5(scores.get(4));
        comment.setTime(new Date());
        return comment;
    }
    public Course getCourse(CourseVO vo){
        Course course = new Course();
        course.setID(vo.getID());
        course.setName(vo.getName());
        List<Integer> scores = vo.getScoreList();
        course.setScore1(scores.get(0));
        course.setScore2(scores.get(1));
        course.setScore3(scores.get(2));
        course.setScore4(scores.get(3));
        course.setScore5(scores.get(4));
        course.setTeacherName(vo.getTeacherName());
        return course;
    }
}
