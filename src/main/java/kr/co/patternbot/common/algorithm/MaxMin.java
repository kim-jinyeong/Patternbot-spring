/**
 * packageName: kr.co.patternbot.common.algorithm
 * fileNa     : MaxMin
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

//getMin getMax 구하기
public class MaxMin {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        private int[] arr;
        private int max, min;

        @Override
        public String toString() {
            return String.format("최소값 : %d 최대값 : %d", min, max);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }

    @Test
    void testSolution(){
        int[] arr = {3, 1, 9, 5, 10};
        SolutionService f = e ->{
            int max = 0;
            for(int i : e.getArr()) if(i > max) max = i;
            int min = max ;
            for(int i : e.getArr()) if(i < min) min = i;
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }

}
