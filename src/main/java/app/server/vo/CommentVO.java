package app.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentVO {
    private int iD;
    private String answerTo;
    private String courseId;
    private String commenter;
    private String comment;
    private int likes;//点赞数
    private String time;
    private boolean like = false;//当前用户是否已经点赞
    private ArrayList<Integer> scoreList = new ArrayList<>(5);
}
