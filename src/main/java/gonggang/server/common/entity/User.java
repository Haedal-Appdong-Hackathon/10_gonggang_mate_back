package gonggang.server.common.entity;

import gonggang.server.user.JoinForm;
import gonggang.server.user.ProfileForm;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
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

    @OneToMany(mappedBy = "user")
    private List<Gonggang> gonggangs;

    public static User toEntity(JoinForm form) {
        return User.builder()
                .avatar(form.getAvatar())
                .account(form.getAccount())
                .password(form.getPassword())
                .schoolNum(form.getSchoolNum())
                .interesting(form.getInteresting())
                .mbti(form.getMbti())
                .nickname(form.getNickname())
                .major(form.getMajor())
                .introduce(form.getInteresting())
                .build();
    }
}
