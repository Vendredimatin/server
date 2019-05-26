package app.server.service;

public interface StudentService {
    String login(String username,String password);
    String register(String username,String password,String school,String studentNumber);
}
