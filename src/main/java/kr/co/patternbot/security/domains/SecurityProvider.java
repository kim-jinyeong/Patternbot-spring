/**
 * packageName: kr.co.patternbot.security.domains
 * fileNa     : SecurityProvider
 * au         : kimjinyeong
 * date       : 2022-05-23
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-23         kimjinyeong    최초 생성
 */

package kr.co.patternbot.security.domains;

import kr.co.patternbot.auth.domains.Role;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

@Component
@RequiredArgsConstructor
@Log // cctv , Security 는 Log 필수
public class SecurityProvider implements AuthenticationProvider {

    private final UserDetailsImpl service;
    @Value("${security.jwt.token.security-key:secret-key}")
    private String securityKey;

    @Value("${security.jwt.token.expiration-length:3600000}")
    private long validityInMs = 3600000; //1h

    @PostConstruct
    protected void init(){
        securityKey = Base64.getEncoder().encodeToString(securityKey.getBytes());
        log.info("securityKey: " + securityKey);
    }

    public String createToken(String username, List<Role> roles){
        return null;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
