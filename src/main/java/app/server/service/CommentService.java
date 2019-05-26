package app.server.service;

import app.server.vo.CommentVO;

import java.util.List;

public interface CommentService {
    List<CommentVO> getCourseComment(String courseId);
    String comment(CommentVO commentVO);
}
