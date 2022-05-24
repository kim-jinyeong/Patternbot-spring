/**
 * packageName: kr.co.patternbot.auth.exception
 * fileNa     : LoginRunnerException
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

public class LoginRunnerException extends RuntimeException {
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}