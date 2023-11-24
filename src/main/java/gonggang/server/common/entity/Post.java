package gonggang.server.common.entity;

import gonggang.server.post.PostForm;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDateTime date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    public static Post toEntity(PostForm form){
        return Post.builder()
                .content(form.getContent())
                .date(form.getDate())
                .title(form.getTitle())
                .build();

    }
}
