package app.server.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    private String iD;
    private String name;
    private String teacherName;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;
    private boolean alive = false;//是否激活
    private boolean anonymous = false;//是否匿名
}
