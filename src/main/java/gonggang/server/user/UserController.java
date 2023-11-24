package gonggang.server.user;

import gonggang.server.common.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/users") // 회원 가입
    public void join(
            @RequestBody JoinForm form
    ) {
        userService.join(form);
    }

    @PostMapping("/login") // 로그인
    public void login(
            @RequestBody LoginForm form,
            HttpServletRequest request) {

        User user = userService.login(form);

        //로그인 성공 처리
        //세션이 있으면 있는 세션 반환, 없으면 신규 세션 생성
        HttpSession session = request.getSession();
        //세션에 로그인 회원 정보 보관
        session.setAttribute("userId", user.getId());
        log.info(session.getAttribute("userId").toString());
    }

    @GetMapping("/profile")
    public ProfileDto getProfile(
            @SessionAttribute(name = "userId", required = false) Long userId
    ) {
        User user = userService.findUser(userId);
        ProfileDto profileDto = ProfileDto.toProfileDto(user);
        return profileDto;
    }
}
