/**
 * packageName: kr.co.patternbot.common.algorithm
 * fileNa     : Fruits
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

//int[][] arr = {{10000, 20000, 12000},
//        {8000, 3000, 15000},
//        {20000, 15000, 38000},
//        {13000, 20000, 30000},
//        {30000, 12000, 20000},
//        {35000, 30000, 25000},
//        {50000, 23000, 10000},
//        };
//  책 자료구조와 알고리즘 36p
public class Fruits {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        private int[][] arr;
        private int total,apple,grape,orange;

        @Override
        public String toString() {
            return String.format("total : %d, apple : %d, grape : %d, orange : %d",total,apple,grape,orange) ;
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){

    }

}
