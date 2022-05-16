/**
 * packageName: kr.co.patternbot.common.lambda
 * fileNa     : MyLambda
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

package kr.co.patternbot.common.lambda;

public class MyLambda {
    @FunctionalInterface
    interface MyFunction{int apply(int arg);}

    @FunctionalInterface
    interface MyConsumer{void set(String arg);}

    @FunctionalInterface
    interface  MySupplier{int get();}

    @FunctionalInterface
    interface LengthOfString{int execute(String arg);}

    @FunctionalInterface
    interface MathOperation{int execute(int a, int b);}
}
