package gonggang.server.post;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostForm {
    private String title;
    private String content;
    private LocalDateTime date;
}
