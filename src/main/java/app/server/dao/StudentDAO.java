package app.server.dao;

import app.server.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,String> {

    public Student getByUsername(String username);
}
