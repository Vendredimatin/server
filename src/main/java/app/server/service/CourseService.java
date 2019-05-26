package app.server.service;

import app.server.vo.CourseVO;

import java.util.List;

public interface CourseService {
    List<CourseVO> getCourses();
    String setCourseAnonymous(String id,boolean anonymous);
}
