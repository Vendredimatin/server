package app.server.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iD;
    private String answerTo = null;//回复的commentId
    private String courseId;
    private String commenter;
    private String comment;
    private int likes;//点赞数
    private Date time;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;
}
