package gonggang.server.post;

import java.util.ArrayList;
import java.util.List;
import gonggang.server.common.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    @Transactional
    public void post (PostForm form){
        Post post = Post.toEntity(form);
        postRepository.save(post);
    }

    @Transactional(readOnly = true)
    public List<Post> getBoard(){
        return postRepository.findAll();
    }
}
