/**
 * packageName: kr.co.patternbot.config
 * fileNa     : SequrityConfig
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

package kr.co.patternbot.security.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@RequiredArgsConstructor
public class SequrityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    @Override
    public void configure(HttpSecurity builder) throws Exception {
        super.configure(builder);
    }
}
