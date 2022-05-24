/**
 * packageName: kr.co.patternbot.auth.exception
 * fileNa     : SecurityRuntimeException
 * au         : kimjinyeong
 * date       : 2022-05-25
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-25         kimjinyeong    최초 생성
 */

package kr.co.patternbot.auth.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class SecurityRuntimeException extends RuntimeException{
    private static final long SerializableUID = 1L;

    private final String msg;
    private final HttpStatus httpStatus;
}