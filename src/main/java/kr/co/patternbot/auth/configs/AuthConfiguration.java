/**
 * packageName: kr.co.patternbot.auth.configs
 * fileNa     : AuthConfiguration
 * au         : kimjinyeong
 * date       : 2022-05-24
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-24         kimjinyeong    최초 생성
 */
package kr.co.patternbot.auth.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class AuthConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers(HttpMethod.OPTIONS,"*/**")
                .antMatchers("/");
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests()
                .antMatchers("/users/join").permitAll()
                .antMatchers("/users/login").permitAll()
                .anyRequest().authenticated();
        http.exceptionHandling().accessDeniedPage("/users/login");
    }
}