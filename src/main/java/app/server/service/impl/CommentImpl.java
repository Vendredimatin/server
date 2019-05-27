package app.server.service.impl;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.bean.Like;
import app.server.bean.RatingDetail;
import app.server.dao.CommentDAO;
import app.server.dao.CourseDAO;
import app.server.dao.LikeDAO;
import app.server.service.CommentService;
import app.server.util.LoggerUtil;
import app.server.util.PtoV;
import app.server.util.VtoP;
import app.server.vo.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static app.server.constants.Constants.FAIL;
import static app.server.constants.Constants.SUC;

@Service
public class CommentImpl implements CommentService {

    private CommentDAO commentDAO;
    private CourseDAO courseDAO;
    private LikeDAO likeDAO;
    public CommentImpl(){}
    @Autowired
    public CommentImpl(CommentDAO commentDAO,CourseDAO courseDAO,LikeDAO likeDAO){
        this.commentDAO = commentDAO;
        this.courseDAO = courseDAO;
        this.likeDAO = likeDAO;
    }

    @Override
    public List<CommentVO> getCourseComment(String courseId,String username) {
        if(courseId!=null&&commentDAO.existsByCourseId(courseId)&&courseDAO.existsById(courseId)) {
                Course course = courseDAO.findById(courseId).get();
                boolean anonymous = course.isAnonymous();
                List<Comment> comments = commentDAO.findAllByCourseId(courseId);
                List<CommentVO> res = new ArrayList<>();
                List<Like> likes = likeDAO.findAllByUsername(username);
                List<Integer> cids = new ArrayList<>();
                for (Like like : likes) {
                    cids.add(like.getCommentId());
                }
                for (Comment comment : comments) {
                    if (anonymous) comment.setCommenter("匿名用户");
                    CommentVO commentVO = PtoV.ptoV.getCommentVO(comment);
                    if (cids.contains(comment.getId())) commentVO.setLike(true);
                    res.add(commentVO);
                }
                return res;

        }
        return new ArrayList<>();
    }

    @Transactional
    @Override
    public String comment(CommentVO commentVO) {
        System.out.println(commentVO);
        Comment comment = VtoP.vtoP.getComment(commentVO);
        if (comment.getAnswerTo() == -1){
            Course course = courseDAO.getOne(commentVO.getCourseId());
            List<Comment> comments = commentDAO.findAllByCourseId(course.getId());
            comments = comments.stream().filter(c -> c.getAnswerTo() == -1).collect(Collectors.toList());
            comments.add(comment);
            List<RatingDetail> ratingDetails = comments.stream().map(Comment::getRatingDetail).collect(Collectors.toList());
            double commentsNumber = comments.size();
            double score1 = ratingDetails.stream().mapToDouble(RatingDetail::getScore1).sum()/commentsNumber;
            double score2 = ratingDetails.stream().mapToDouble(RatingDetail::getScore2).sum()/commentsNumber;
            double score3 = ratingDetails.stream().mapToDouble(RatingDetail::getScore3).sum()/commentsNumber;
            double score4 = ratingDetails.stream().mapToDouble(RatingDetail::getScore4).sum()/commentsNumber;
            double score5 = ratingDetails.stream().mapToDouble(RatingDetail::getScore5).sum()/commentsNumber;
            RatingDetail ratingDetail = new RatingDetail(score1,score2,score3,score4,score5);
            course.setRatingDetail(ratingDetail);
            System.out.println(ratingDetail);
            courseDAO.save(course);
        }
        try {
            commentDAO.save(comment);

            LoggerUtil.loggerUtil.logInfo("Comment Success");
        }catch (Exception e){
            LoggerUtil.loggerUtil.logErr(e.getMessage());
            return FAIL;
        }
        return SUC;
    }

    @Override
    public String like(String username, int commentId) {
        Like like = new Like();
        like.setCommentId(commentId);
        like.setUsername(username);
        Comment comment = commentDAO.getOne(commentId);
        comment.setLikes(comment.getLikes()+1);
        try {
            commentDAO.save(comment);
            likeDAO.save(like);
            return SUC;
        }catch (Exception e){
            LoggerUtil.loggerUtil.logErr(e.getMessage());
            return FAIL;
        }
    }

    @Transactional
    @Override
    public String cancelLike(String username, int commentId) {
        if(username!=null&&likeDAO.existsByCommentIdAndUsername(commentId,username)){
            likeDAO.deleteByCommentIdAndUsername(commentId,username);
            return SUC;
        }
        return FAIL;
    }
}
