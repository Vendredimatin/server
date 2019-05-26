package app.server.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lik")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iD;
    private String username;
    private int commentId;
}
