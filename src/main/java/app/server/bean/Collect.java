package app.server.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "collect")
public class Collect {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iD;
    private String username;
    private String courseId;
}
