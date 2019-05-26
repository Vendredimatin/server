package app.server.util;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PtoV {
    public static final PtoV ptoV = new PtoV();
    private SimpleDateFormat dateFormatMin=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置当前时间的格式，为年-月-日 时-分-秒
    private PtoV(){}
    public CommentVO getCommentVO(Comment po){
        CommentVO commentVO = new CommentVO();
        commentVO.setComment(po.getComment());
        commentVO.setID(po.getID());
        commentVO.setLikes(po.getLikes());
        commentVO.setCommenter(po.getCommenter());
        commentVO.setCourseId(po.getCourseId());
        commentVO.setAnswerTo(po.getAnswerTo());
        commentVO.setTime(dateFormatMin.format(po.getTime()));
        List<Integer> scores = new ArrayList<>(5);
        scores.add(po.getScore1());
        scores.add(po.getScore2());
        scores.add(po.getScore3());
        scores.add(po.getScore4());
        scores.add(po.getScore5());
        commentVO.setScoreList(scores);
        return commentVO;
    }

    public CourseVO getCourseVO(Course po){
        CourseVO courseVO = new CourseVO();
        courseVO.setID(po.getID());
        courseVO.setName(po.getName());
        courseVO.setTeacherName(po.getTeacherName());
        List<Integer> scores = new ArrayList<>(5);
        scores.add(po.getScore1());
        scores.add(po.getScore2());
        scores.add(po.getScore3());
        scores.add(po.getScore4());
        scores.add(po.getScore5());
        courseVO.setScoreList(scores);
        courseVO.setAnonymous(po.isAnonymous());
        return courseVO;
    }
}
