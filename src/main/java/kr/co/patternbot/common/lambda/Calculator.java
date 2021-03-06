/**
 * packageName: kr.co.patternbot.common.lambda
 * fileNa     : Calcurator
 * au         : kimjinyeong
 * date       : 2022-05-11
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.lambda;


import static kr.co.patternbot.common.lambda.Lambda.random;

public class Calculator {
    public static void main(String... args) {
        var s = "계산기";
        System.out.println(s);
        Calculator c = new Calculator();
        System.out.println("10 + 5 = " + c.operate(10, 5, (a, b) -> a + b));
        System.out.println("10 - 5 = " + c.operate(10, 5, (a, b) -> a - b));
        System.out.println("10 x 5 = " + c.operate(10, 5, (a, b) -> a * b));
        System.out.println("10 / 5 = " + c.operate(10, 5, (a, b) -> a / b));
        System.out.println(random(0,5));
    }
    interface Arithmetic{
        int operation(int a, int b);
    }
    private int operate(int a, int b, Arithmetic arith){
        return arith.operation(a, b);
    }
}
