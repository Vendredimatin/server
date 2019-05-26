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
    private int ID;
    private String replyComment;//回复的commentId
    private String courseId;
    private String commenter;
    private String comment;
    private int likes;//点赞数
    private Date time;
    private int score1,score2,score3,score4,score5;
}
