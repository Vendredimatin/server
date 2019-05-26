package app.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO {

    private String username;
    private String password;
    private String school;//学校
    private String college;//学院
    private String major;//专业
    private String studentNumber;
}
