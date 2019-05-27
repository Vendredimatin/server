package app.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentVO {
    private int id;
    private int answerTo;
    private String courseId;
    private String commenter;
    private String content;
    private int likes;//点赞数
    private String time;
    private boolean like = false;//当前用户是否已经点赞
    private ArrayList<Integer> scoreList = new ArrayList<>(5);

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

    public String getContent() {
        return content;
    }

    public void setContent(String comment) {
        this.content = comment;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public ArrayList<Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Integer> scoreList) {
        this.scoreList = scoreList;
    }
}
