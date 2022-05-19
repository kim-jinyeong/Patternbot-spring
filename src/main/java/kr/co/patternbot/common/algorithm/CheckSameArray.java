/**
 * packageName: kr.co.patternbot.common.algorithm
 * fileNa     : CheckSameArray
 * au         : kimjinyeong
 * date       : 2022-05-17
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**순서가 없는 두 배열에서 서로 같은 요소를 포함하고 있는지 판별하는 메서드를 작성하시오
 * ex A 배열 [1,3,2] 와 B 배열 [2, 3, 1] 은 같은 배열 입니다.
 * 참고 ) 책 자료구조와 알고리즘 40p
 */
public class CheckSameArray {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        private String result;
        @Override
        public String toString() {
            return String.format("A 배열과 B 배열은 %s 배열 입니다.",result);
        }
    }
    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void test(){

    }
}
