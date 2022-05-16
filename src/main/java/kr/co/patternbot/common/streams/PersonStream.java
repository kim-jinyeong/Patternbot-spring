/**
 * packageName: kr.co.patternbot.common.streams
 * fileNa     : PersonStream
 * au         : kimjinyeong
 * date       : 2022-05-16
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-16         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonStream {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Person{
        private String name, ssn;

        @Override
        public String toString() {
            return "성함 : " +  name + " 나이 : " + ((123 - Integer.valueOf(ssn.substring(0,2))) % 100)
                    + " 성별 : " + (Integer.valueOf(ssn.charAt(7)) % 2 == 0 ? "여성입니다" : "남성입니다.");
        }
    }
    // 기능 : 회원 검색


    interface PersonService{ Person search(List<Person>arr);}

    static class PersonServiceImpl implements PersonService{

        @Override
        public Person search(List<Person>arr) {
                    return arr.stream()
                            .filter(e -> e.getName().equals("홍길동"))
                            .collect(Collectors.toList()).get(0);
        }
    }
    @Test
    void personStreamTest(){
        // "홍길동" , "900120-1"
        // "유관순" , "040920-4"
        // 남성, 여성 판단 로직
        List<Person> arr = Arrays.asList(
                Person.builder().name("홍길동").ssn("990120-1").build(),
                Person.builder().name("홍순이").ssn("950120-2").build(),
                Person.builder().name("김유신").ssn("970620-3").build(),
                Person.builder().name("유관순").ssn("040920-4").build()
        );
        System.out.println(
                new PersonServiceImpl()
                .search(arr)
        );

    }
}
