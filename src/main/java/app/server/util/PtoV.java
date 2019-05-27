package app.server.util;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.bean.RatingDetail;
import app.server.vo.CommentVO;
import app.server.vo.CourseVO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PtoV {
    public static final PtoV ptoV = new PtoV();
    private SimpleDateFormat dateFormatMin=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置当前时间的格式，为年-月-日 时-分-秒
    private PtoV(){}
    public CommentVO getCommentVO(Comment po){
        CommentVO commentVO = new CommentVO();
        commentVO.setContent(po.getCommentInfo());
        commentVO.setId(po.getId());
        commentVO.setLikes(po.getLikes());
        commentVO.setCommenter(po.getCommenter());
        commentVO.setCourseId(po.getCourseId());
        commentVO.setAnswerTo(po.getAnswerTo());
        commentVO.setTime(dateFormatMin.format(po.getTime()));
        ArrayList<Integer> scores = new ArrayList<>(5);
        RatingDetail ratingDetail = po.getRatingDetail();
        scores.add(ratingDetail.getScore1());
        scores.add(ratingDetail.getScore2());
        scores.add(ratingDetail.getScore3());
        scores.add(ratingDetail.getScore4());
        scores.add(ratingDetail.getScore5());

        commentVO.setScoreList(scores);
        return commentVO;
    }

    public CourseVO getCourseVO(Course po){
        CourseVO courseVO = new CourseVO();
        courseVO.setId(po.getId());
        courseVO.setName(po.getName());
        courseVO.setTeacherName(po.getTeacherName());
        ArrayList<Integer> scores = new ArrayList<>(5);
        RatingDetail ratingDetail = po.getRatingDetail();
        scores.add(ratingDetail.getScore1());
        scores.add(ratingDetail.getScore2());
        scores.add(ratingDetail.getScore3());
        scores.add(ratingDetail.getScore4());
        scores.add(ratingDetail.getScore5());
        courseVO.setScoreList(scores);
        courseVO.setAnonymous(po.isAnonymous());
        return courseVO;
    }
}
