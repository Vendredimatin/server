package app.server.service.impl;

import app.server.bean.Student;
import app.server.dao.StudentDAO;
import app.server.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static app.server.constants.Constants.FAIL;
import static app.server.constants.Constants.SUC;


@Service
public class StudentImpl implements StudentService {

    private StudentDAO studentDAO;
    public StudentImpl(){}
    @Autowired
    public StudentImpl(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }
    @Override
    public String login(String username, String password) {
        if(studentDAO.existsById(username)) {
            Student student = studentDAO.findById(username).get();
            String rightPass = student.getPassword();
            if (!rightPass.equals(password)) return FAIL;
            return SUC;
        }
        return FAIL;
    }

    @Override
    public String register(String username, String password, String school, String college,String major,String studentNumber) {
        if(studentDAO.existsById(username))return "EXIST";
        Student student = new Student(username,password,school,college,major,studentNumber);
        studentDAO.save(student);
        return SUC;
    }

    @Override
    public String updateStudentInfo(String username,String school, String college, String major, String studentNumber) {
        if(studentDAO.existsById(username)) {
            Student student = studentDAO.findById(username).get();
            student.setSchool(school);
            student.setCollege(college);
            student.setMajor(major);
            student.setStudentNumber(studentNumber);
            studentDAO.save(student);
            return SUC;
        }
        return FAIL;
    }

    @Override
    public String updateStudentPassword(String username, String password, String newPass) {
        if(studentDAO.existsById(username)){
            Student student = studentDAO.findById(username).get();
            if(student.getPassword().equals(password)){
                student.setPassword(newPass);
                studentDAO.save(student);
                return SUC;
            }
        }
        return FAIL;
    }
}
