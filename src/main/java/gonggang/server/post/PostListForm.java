package gonggang.server.post;

import gonggang.server.common.entity.Gonggang;
import gonggang.server.common.entity.Post;
import gonggang.server.gonggang.GonggangDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostListForm {
    private Long postId;

    private String title;
    private LocalDateTime date;
    private String nickname;

    public static PostListForm toPostListForm(Post post) {
        return PostListForm.builder()
                .postId(post.getId())
                .title(post.getTitle())
                .date(post.getDate())
                .nickname(post.getUser().getNickname())
                .build();
    }
}
