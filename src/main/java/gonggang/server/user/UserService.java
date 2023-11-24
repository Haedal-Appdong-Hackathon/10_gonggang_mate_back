package gonggang.server.user;

import gonggang.server.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static java.util.Objects.isNull;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void join(JoinForm form) {
        User user = User.toEntity(form);

        userRepository.save(user);
    }
}
