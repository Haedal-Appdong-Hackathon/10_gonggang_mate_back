package gonggang.server.user;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProfileForm {

    private String avatar;
    private String nickname;
    private String schoolNum;
    private String interesting;
    private String mbti;
    private String major;
    private String introduce;
}
