package gonggang.server.user;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JoinForm {
    private String avatar;
    private String account;
    private String password;
    private String schoolNum;
    private String interesting;
    private String mbti;
    private String nickname;
    private String major;
    private int age;
}
