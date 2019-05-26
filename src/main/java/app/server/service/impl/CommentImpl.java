package app.server.service.impl;

import app.server.bean.Comment;
import app.server.bean.Course;
import app.server.dao.CommentDAO;
import app.server.dao.CourseDAO;
import app.server.service.CommentService;
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
    @Override
    public List<CommentVO> getCourseComment(String courseId) {
        if(!commentDAO.existsByCourseId(courseId))return null;
        if(!courseDAO.existsById(courseId))return null;
        Course course = courseDAO.findById(courseId).get();
        boolean anonymous = course.isAnonymous();
        List<Comment> comments = commentDAO.findAllByCourseId(courseId);
        List<CommentVO> res = new ArrayList<>();
        for(Comment comment: comments){
            if(anonymous)comment.setCommenter("匿名用户");
            res.add(PtoV.ptoV.getCommentVO(comment));
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
}
