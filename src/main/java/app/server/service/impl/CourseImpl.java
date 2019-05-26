package app.server.service.impl;

import app.server.service.CourseService;
import app.server.vo.CourseVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseImpl implements CourseService {
    @Override
    public List<CourseVO> getCourses() {
        return null;
    }
}
