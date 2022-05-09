/**
 * packageName: kr.co.patternbot.soccer.domains
 * fileNa     : Stadium
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

package kr.co.patternbot.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Component
public class Stadium {
    @Id String stadiumId;
    private String stadiumName;
    private String hometeamId;
    private String seatCount;
    private String address;
    private String ddd;
    private String tel;
}
