package app.server.service;

import app.server.vo.CommentVO;

public interface CommentService {
    CommentVO getCourseComment(String courseId);
    String comment(CommentVO commentVO);
}
