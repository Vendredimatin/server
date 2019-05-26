package app.server.dao;

import app.server.bean.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeDAO extends JpaRepository<Like,Integer> {
    boolean existsByCommentIdAndUsername(int commentId,String username);
    void deleteByCommentIdAndUsername(int commentId,String username);
    List<Like> findAllByUsername(String username);
}
