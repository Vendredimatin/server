package app.server.service.impl;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.bean.Like;
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

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentImpl implements CommentService {
    @Autowired
    CommentDAO commentDAO;
    @Autowired
    CourseDAO courseDAO;
    @Autowired
    LikeDAO likeDAO;
    @Override
    public List<CommentVO> getCourseComment(String courseId,String username) {
        if(!commentDAO.existsByCourseId(courseId))return null;
        if(!courseDAO.existsById(courseId))return null;
        Course course = courseDAO.findById(courseId).get();
        boolean anonymous = course.isAnonymous();
        List<Comment> comments = commentDAO.findAllByCourseId(courseId);
        List<CommentVO> res = new ArrayList<>();
        List<Like> likes = likeDAO.findAllByUsername(username);
        List<Integer> cids = new ArrayList<>();
        for(Like like:likes){
            cids.add(like.getCommentId());
        }
        for(Comment comment: comments){
            if(anonymous)comment.setCommenter("匿名用户");
            CommentVO commentVO = PtoV.ptoV.getCommentVO(comment);
            if(cids.contains(comment.getID()))commentVO.setLike(true);
            res.add(commentVO);
        }
        return res;
    }

    @Override
    public String comment(CommentVO commentVO) {
        Comment comment = VtoP.vtoP.getComment(commentVO);
        try {
            commentDAO.save(comment);
        }catch (Exception e){
            e.printStackTrace();
            return "FAILURE";
        }
        return "SUCCESS";
    }

    @Override
    public String like(String username, int commentId) {
        Like like = new Like();
        like.setCommentId(commentId);
        like.setUsername(username);
        try {
            likeDAO.save(like);
            return "SUCCESS";
        }catch (Exception e){
            LoggerUtil.loggerUtil.logErr("LikeErr "+username+commentId);
            e.printStackTrace();
            return "FAILURE";
        }
    }

    @Override
    public String cancelLike(String username, int commentId) {
        if(likeDAO.existsByCommentIdAndUsername(commentId,username)){
            likeDAO.deleteByCommentIdAndUsername(commentId,username);
            return "SUCCESS";
        }
        return "FAILURE";
    }
}