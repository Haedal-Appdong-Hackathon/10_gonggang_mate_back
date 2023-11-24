package gonggang.server.common.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String avatar;
    private String account;
    private String password;
    private String schoolNum;
    private String interesting;
    private String mbti;
    private String nickname;
    private String major;
    private String introduce;
    private String wantToDo;

}
