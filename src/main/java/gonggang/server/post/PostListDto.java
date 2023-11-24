package gonggang.server.post;

import gonggang.server.common.entity.Post;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostListDto {

    private List<PostListForm> contents = new ArrayList<>();

    public static PostListDto toPostListDto(List<PostListForm> posts) {
        return PostListDto.builder()
                .contents(posts)
                .build();
    }
}
