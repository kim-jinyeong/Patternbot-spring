/**
 * packageName: kr.co.patternbot.domains
 * fileNa     : User
 * au         : kimjinyeong
 * date       : 2022-05-03
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03         kimjinyeong    최초 생성
 */

package kr.co.patternbot.auth.domains;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Data
@Component
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String userid;
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private String phone;
    private String birth;
    private String address;
}
