/**
 * packageName: kr.co.patternbot.auth.domains
 * fileNa     : Messenger
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

package kr.co.patternbot.auth.domains;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Messenger {
    private String message, code, token;
    private int status;
}