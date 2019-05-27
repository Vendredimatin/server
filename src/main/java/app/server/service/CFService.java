package app.server.service;

import java.util.Map;

public interface CFService {
    Map<String,Double> getRecommendCourses(String username);
}
