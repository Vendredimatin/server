package app.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentVO {
    private String courseId;
    private String commenter;
    private String comment;
    private String time;
    private List<Integer> scoreList = new ArrayList<>(5);
}
