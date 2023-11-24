package gonggang.server.post;

import java.util.List;

import gonggang.server.common.entity.Post;
import lombok.RequiredArgsConstructor;
import  lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;

    @PostMapping("/post/{postId}")
    public void post(
        @RequestBody PostForm form
    ){
        postService.post(form);
    }
    @GetMapping("/board")
    public List<Post> getBoard(){
        return postService.getBoard();
    }
}
