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
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String result = "";
        MemberService service = new MemberServiceImpl();
        while(true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existById 9.clear");
            switch (s.next()){
                case "0":return;
                case "1":
                    Member hong = new Member.Builder("hong")
                            .email("hong@test.com")
                            .password("1")
                            .name("홍길동")
                            .phone("010-0000-9999")
                            .profileImg("hong.jpg")
                            .build();
                    service.save(hong);
                    Member kim = new Member.Builder("kim")
                            .email("kim@test.com")
                            .password("1")
                            .name("김유신")
                            .phone("010-0044-9944")
                            .profileImg("kim.jpg")
                            .build();
                    service.save(kim);
                    Member you = new Member.Builder("you")
                            .email("you@test.com")
                            .password("1")
                            .name("유관순")
                            .phone("010-0880-9889")
                            .profileImg("you.jpg")
                            .build();
                    service.save(you);
                    break;
                case "2":break;
                case "3":
                    Member temp = new Member();
                    temp.setUserid("kim");
                    service.delete(temp);
                    break;
                case "4":
                    result = service.findById("you") == null ? "값이 없습니다." : String.valueOf(service.findById("you"));
                    System.out.println(result);
                    break;
                case "5":break;
                case "6": break;
                case "7":
                    System.out.println("총 회원수: "+service.count()+" 명");
                    break;
                case "8":
                    result = service.existById("kim") ? "값이 있습니다." : "값이 없습니다.";
                    System.out.println(result);
                    break;
                case "9":
                    service.clear();
                    break;
                default:break;
            }
        }
    }
    @Data
    @NoArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;
        public Member(Builder builder){
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }
        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder(String userid){this.userid = userid;}
            public Builder name(String name){this.name = name;return this;}
            public Builder password(String password){this.password = password;return this;}
            public Builder profileImg(String profileImg){this.profileImg = profileImg;return this;}
            public Builder phone(String phone){this.phone = phone; return this;}
            public Builder email(String email){this.email = email; return this;}
            Member build(){ return new Member(this);}
        }
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s ",
                    userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        List<Member>findAll();
        List<Member>findByName(String name);
        Member findById(String id);
        int count();
        boolean existById(String id);
        void clear();
   }
    static class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;
        MemberServiceImpl(){
            this.map = new HashMap<>();
        }
        @Override
        public void save(Member member){
            map.put(member.getUserid(), member);
        }

        @Override
        public void update(Member member) {
            map.replace(member.getUserid(), member);
        }

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid());
        }

        @Override
        public List<Member> findAll() {
            return (List<Member>) map.values();
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }

        @Override
        public Member findById(String id) {
            return map.get(id);
        }

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existById(String id) {
            return map.containsKey(id);
        }

        @Override
        public void clear() {
            map.clear();
        }


    }
}

