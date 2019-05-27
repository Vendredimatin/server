package app.server.bean;

import app.server.converter.RatingDetainsConverter;
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
    private int id;
    private int answerTo = -1;//回复的commentId
    private String courseId;
    private String commenter;
    private String commentInfo;
    private int likes;//点赞数
    private Date time;
    @Convert(converter = RatingDetainsConverter.class)
    private RatingDetail ratingDetail;

    public RatingDetail getRatingDetail() {
        return ratingDetail;
    }

    public void setRatingDetail(RatingDetail ratingDetail) {
        this.ratingDetail = ratingDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnswerTo() {
        return answerTo;
    }

    public void setAnswerTo(int answerTo) {
        this.answerTo = answerTo;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCommenter() {
        return commenter;
    }

    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


}
