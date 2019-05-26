package app.server.service.impl;

import app.server.service.CommentService;
import app.server.vo.CommentVO;
import org.springframework.stereotype.Service;

@Service
public class CommentImpl implements CommentService {
    @Override
    public CommentVO getCourseComment(String courseId) {
        return null;
    }

    @Override
    public String comment(CommentVO commentVO) {
        return null;
    }
}
