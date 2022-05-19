/**
 * packageName: kr.co.patternbot.common.algorithm
 * fileNa     : PrimeNumber
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
import java.util.List;

public class PrimeNumber {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        private int start, end;
        private List<Integer> primes;

        @Override
        public String toString() {
            return String.format(" ");
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution( Solution s);
    }
    @Test
    void testSolution(){

    }

}
