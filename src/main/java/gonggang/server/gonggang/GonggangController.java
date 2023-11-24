package gonggang.server.gonggang;

import gonggang.server.common.entity.User;
import gonggang.server.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
@RequiredArgsConstructor
public class GonggangController {

    private final UserService userService;
    private final GonggangService gonggangService;

    @GetMapping("/mySchedule") // 시간표 조회
    public GonggangDto schedule(
            @SessionAttribute(name = "userId", required = false) Long userId
    ) {
        User user = userService.findUser(userId);
        GonggangDto contents = gonggangService.getschedule(user);
        return contents;
    }
}
