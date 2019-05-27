package app.server.bean;

import app.server.converter.RatingDetainsConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    private String id;
    private String name;
    private String teacherName;
    @Convert(converter = RatingDetainsConverter.class)
    private RatingDetail ratingDetail;
    @Column(columnDefinition="bool default false")
    private boolean alive = false;//是否激活
    @Column(columnDefinition = "bit(1) default 0")
    private boolean anonymous = false;//是否匿名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public boolean isAlive() {
        return alive;
    }

    public RatingDetail getRatingDetail() {
        return ratingDetail;
    }

    public void setRatingDetail(RatingDetail ratingDetail) {
        this.ratingDetail = ratingDetail;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }


}
