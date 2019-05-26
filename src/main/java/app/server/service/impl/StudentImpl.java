package app.server.service.impl;

import app.server.bean.Student;
import app.server.dao.StudentDAO;
import app.server.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;
    @Override
    public String login(String username, String password) {
        if(!studentDAO.existsById(username))return "FAILURE";
        Student student = studentDAO.findById(username).get();
        String rightPass = student.getPassword();
        if(!rightPass.equals(password))return "FAILURE";
        return "SUCCESS";
    }

    @Override
    public String register(String username, String password, String school, String studentNumber) {
        if(studentDAO.existsById(username))return "EXIST";
        Student student = new Student(username,password,school,studentNumber);
        studentDAO.save(student);
        return "SUCCESS";
    }
}
