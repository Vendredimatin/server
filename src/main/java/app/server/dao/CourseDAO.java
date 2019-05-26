package app.server.dao;

import app.server.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseDAO extends JpaRepository<Course,String> {
    List<Course> findAllByAlive(boolean alive);
}
