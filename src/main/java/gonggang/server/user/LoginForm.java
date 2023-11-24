package gonggang.server.user;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginForm {

    private String account;
    private String password;
}
