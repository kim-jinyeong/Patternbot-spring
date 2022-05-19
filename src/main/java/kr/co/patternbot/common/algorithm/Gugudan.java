/**
 * packageName: kr.co.patternbot.common.algorithm
 * fileNa     : Gugudan
 * au         : kimjinyeong
 * date       : 2022-05-18
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-18         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Gugudan {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Solution{
        private String result;
        private int num;
        @Override
        public String toString() {
            return result;
        }
    }

    @FunctionalInterface interface ISolution{
        Solution solution(Solution s);
    };
    @Test
    void test(){

        ISolution f = (e) -> {
            String result = "";
            for(int k = 2; k <= e.getNum(); k+=4) {
                for (int i = 1; i <= e.getNum(); i++) {
                    for (int j = k; j < k+4; j++) {
                        result +=  j + "*" + i+ "=" +(j*i)+"\t";
                    }
                    result += '\n';
                }
                result += '\n';
            }
            return Solution.builder().result(result).build();
        } ;
        Solution s = Solution.builder().num(9).build();
        System.out.println(f.solution(s));
    }
}
