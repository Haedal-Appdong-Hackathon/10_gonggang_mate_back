package gonggang.server.post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import gonggang.server.common.entity.Post;
import gonggang.server.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    @Transactional
    public void post (PostForm form, User user){
        Post post = Post.toEntity(form);
        post.setUser(user);
        post.setDate(LocalDateTime.now());
        postRepository.save(post);
    }

    @Transactional
    public PostListDto getBoard(){
        List<PostListForm> postListForms = new ArrayList<>();
        List<Post> posts = postRepository.findAll();
        for (Post post : posts) {
            PostListForm postListForm = PostListForm.toPostListForm(post);
            postListForms.add(postListForm);
        }
        return PostListDto.toPostListDto(postListForms);
    }
}
