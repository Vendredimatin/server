package app.server.dao;

import app.server.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course,String> {
}
