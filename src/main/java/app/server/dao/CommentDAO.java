package app.server.dao;

import app.server.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CommentDAO extends JpaRepository<Comment,Integer> {
    List<Comment> findAllByCourseId(String courseId);
    Boolean existsByCourseId(String couresId);
    List<Comment> findAllByCourseIdAndCommenter(String courseId,String username);
}
