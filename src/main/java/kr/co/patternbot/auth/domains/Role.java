/**
 * packageName: kr.co.patternbot.auth.domains
 * fileNa     : Role
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

package kr.co.patternbot.auth.domains;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
    ADMIN("ROLE_ADMIN", "관리자권한"),
    USER("ROLE_USER", "사용자권한"),
    UNKOWN_USER("ROLE_UNKOWN_USER", "알수 없는 사용자");

    private final String code;
    private final String description;

    public static Role of(String code) {
        return Arrays.stream(Role.values()).filter(i -> i.getCode().equals(code))
                .findAny().orElse(UNKOWN_USER);
    }

    ;
    @Override
    public String getAuthority() {
        return name();
    }
}
