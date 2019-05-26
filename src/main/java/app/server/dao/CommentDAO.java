package app.server.dao;

import app.server.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CommentDAO extends JpaRepository<Comment,Integer> {
}
