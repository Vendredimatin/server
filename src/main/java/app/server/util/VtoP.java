package app.server.util;

import app.server.bean.Comment;
import app.server.bean.RatingDetail;
import app.server.vo.CommentVO;

import java.util.Date;
import java.util.List;

public class VtoP {
    public static final VtoP vtoP = new VtoP();
    private VtoP(){}
    public Comment getComment(CommentVO vo){
        Comment comment = new Comment();
        comment.setCommentInfo(vo.getContent());
        comment.setCommenter(vo.getCommenter());
        comment.setCourseId(vo.getCourseId());
        comment.setAnswerTo(vo.getAnswerTo());
        comment.setLikes(vo.getLikes());
        List<Integer> scores = vo.getScoreList();
        RatingDetail ratingDetail = new RatingDetail(scores.get(0),scores.get(1),scores.get(2),scores.get(3),scores.get(4));
        comment.setRatingDetail(ratingDetail);
        comment.setTime(new Date());
        return comment;
    }
}
