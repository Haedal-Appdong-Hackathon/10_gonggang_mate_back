package gonggang.server.post;

import java.util.List;

import gonggang.server.common.entity.Post;
import gonggang.server.common.entity.User;
import gonggang.server.user.UserService;
import lombok.RequiredArgsConstructor;
import  lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;
    private final UserService userService;

    @PostMapping("/post") // 글쓰기
    public void post(
        @RequestBody PostForm form,
        @SessionAttribute(name = "userId", required = false) Long userId
    ){
        User user = userService.findUser(userId);
        postService.post(form, user);
    }

    @GetMapping("/board")
    public PostListDto getBoard(){
        return postService.getBoard();
    }
}
