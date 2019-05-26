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
    private String iD;
    private String name;
    private String teacherName;
    private List<Integer> scoreList = new ArrayList<>(5);
    boolean anonymous = false;
    boolean collect = false;
}
