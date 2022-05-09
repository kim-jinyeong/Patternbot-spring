/**
 * packageName: kr.co.patternbot.common.algorithm
 * fileNa     : MemberCRUD
 * au         : kimjinyeong
 * date       : 2022-05-09
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Scanner;

public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("0.exit 1.register 2.findById 3.findByName 4.memberList 5.count 6.update 7.remove");
            switch (s.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                default:break;
            }
        }
    }
    @Data  @AllArgsConstructor
    class Member{
        protected String userid, name, password, profileImg, phone, email;
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s ",
                    userid, name, password, profileImg, phone, email);
        }
    }
    @RequiredArgsConstructor
    class MemberService{
        private final Map<String, Member> map;
        void register(Member member){ map.put(member.getUserid(), member);}
    }
}

