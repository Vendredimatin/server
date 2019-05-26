package app.server.dao;

import app.server.bean.Collect;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollectDAO extends JpaRepository<Collect,Integer> {
    boolean existsByCourseIdAndUsername(String courseId,String username);
    boolean existsByUsername(String username);
    void deleteByCourseIdAndUsername(String courseId,String username);
    List<Collect> findAllByUsername(String username);
}
