package gonggang.server.post;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PostForm {
    private String title;
    private String content;
    private LocalDateTime date = LocalDateTime.now();
}
