/**
 * packageName: kr.co.patternbot.soccer.domains
 * fileNa     : Schedule
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

@Component
@Data
@Entity
public class Schedule {
    @Id String scheDate;
    private String stadiumId;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private String homeScore;
    private String awayScore;
}
