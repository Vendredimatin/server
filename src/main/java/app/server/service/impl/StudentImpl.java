package app.server.service.impl;

import app.server.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {
    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String register(String username, String password, String school, String studentNumber) {
        return null;
    }
}
