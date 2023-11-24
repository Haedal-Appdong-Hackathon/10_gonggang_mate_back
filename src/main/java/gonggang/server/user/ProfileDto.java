package gonggang.server.user;

import gonggang.server.common.entity.User;
import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProfileDto {

    private String avatar;
    private String nickname;
    private String schoolNum;
    private String interesting;
    private String mbti;
    private String major;
    private String introduce;

    public static ProfileDto toProfileDto(User user) {
        return ProfileDto.builder()
                .avatar(user.getAvatar())
                .nickname(user.getNickname())
                .schoolNum(user.getSchoolNum())
                .interesting(user.getInteresting())
                .mbti(user.getMbti())
                .major(user.getMajor())
                .introduce(user.getIntroduce())
                .build();
    }
}
