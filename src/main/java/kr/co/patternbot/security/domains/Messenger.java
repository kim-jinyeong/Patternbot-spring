/**
 * packageName: kr.co.patternbot.security.domains
 * fileNa     : Messenger
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

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Messenger {
    private String message, code;
    private int status;

}
