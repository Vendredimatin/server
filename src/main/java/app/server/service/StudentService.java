package app.server.service;

import app.server.bean.Student;

public interface StudentService {
    String login(String username,String password);
    String register(String username,String password,String school,String college,String major,String studentNumber);

    String updateStudentInfo(String username, String school, String college, String major, String studentNumber);

    String updateStudentPassword(String username, String password, String newPass);

    Student getStudentInfo(String userName);
}
