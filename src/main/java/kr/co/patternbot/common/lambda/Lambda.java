/**
 * packageName: kr.co.patternbot.common.lambda
 * fileNa     : Lambda
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


import org.junit.jupiter.api.Test;

import static kr.co.patternbot.common.dataStructure.AppleList.Apple;
import static kr.co.patternbot.common.dataStructure.AppleList.Apple.Builder;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {
    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static String string(Object ob){
        Function<Object, String> f = String::valueOf;
        return f.apply(ob);
    }
    public static long longParse(String s){
        Function<String, Long> f = Long :: parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float :: parseFloat;
        return f.apply(s);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1,s2);
    }

    public static int[] arr(int a){
        Function<Integer ,int[]> f = int[]::new;
        return f.apply(a);
    }
    public static int random(int min, int max) {
        BiFunction<Integer,Integer,Integer> f = (a, b) -> (int)(Math.random()*b) + a;
        return f.apply(min,max);
        //return f.apply(min,max);
    }
    public static File makefile(String http){
        Function<String, File> f = File ::new;
        return f.apply(http);
    }
    public static String getDate(){
        Supplier<String> f = () -> string(LocalDate.now());
        return f.get();
    }
    @Test
    void LambdaTest(){
        System.out.println();
        System.out.println(arr(8).length);
        System.out.println(random(0,5));
        System.out.println(getDate());
    }
}
