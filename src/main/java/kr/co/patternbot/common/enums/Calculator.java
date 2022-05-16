/**
 * packageName: kr.co.patternbot.common.enums
 * fileNa     : Calculator
 * au         : kimjinyeong
 * date       : 2022-05-13
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-13         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.enums;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

public class Calculator {
    @RequiredArgsConstructor
    enum Operation{
        PLUS("+" , (x, y) -> (x + y)),
        MINUS("-" , (x, y) -> (x - y)),
        MULTI("*" , (x, y) -> (x * y)),
        DIVIDE("/" , (x, y) -> (x / y)),
        ;
        private final String opcode;
        private final BiFunction<Integer, Integer, Integer> f;

        @Override
        public String toString() {
            return opcode;
        }
        public int apply(int a, int b){
            return f.apply(a,b);
        }
    }
    @Test
    void CalucuratorTest(){
        System.out.println(Operation.PLUS.toString() + " : " + Operation.PLUS.apply(7,5));
        System.out.println(Operation.MINUS.toString() + " : " + Operation.MINUS.apply(7,5));
        System.out.println(Operation.MULTI.toString() + " : " + Operation.MULTI.apply(7,5));
        System.out.println(Operation.DIVIDE.toString() + " : " + Operation.DIVIDE.apply(7,5));
    }
}
