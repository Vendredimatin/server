package app.server.service;

import app.server.vo.CourseVO;

import java.util.List;

public interface CourseService {
    List<CourseVO> getCourses(String username);
    String setCourseAnonymous(String id,boolean anonymous);
    String collect(String username,String courseId);
    String cancelCollect(String username,String courseId);

    CourseVO getCourseById(String id,String username);

    String createCourse(String id, String name, String teacherName);

    String confirmCourse(String id);

    List<CourseVO> getUnconfirmList();
}
