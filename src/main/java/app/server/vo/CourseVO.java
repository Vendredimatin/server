package app.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseVO {
    private String ID;
    private String teacherName;
    private List<Integer> scoreList = new ArrayList<>(5);
}
