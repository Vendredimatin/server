package app.server.service;

import app.server.vo.CommentVO;

import java.util.List;

public interface CommentService {
    List<CommentVO> getCourseComment(String courseId,String username);
    String comment(CommentVO commentVO);
    String like(String username,int commentId);
    String cancelLike(String username,int commentId);
}
