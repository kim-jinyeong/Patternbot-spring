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

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date")
    @NotNull private String regDate;

    @OneToMany(mappedBy = "user")
    List<Article> ls = new ArrayList<>();

}
