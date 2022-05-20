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

import javax.persistence.*;

@Component
@Data
@Entity
@Table(name = "Schedules")
public class Schedule {
    @Id
    @Column(name = "schedule_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleNo;
    private String scheDate;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private String homeScore;
    private String awayScore;
    private String stadiumId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_no")
    private Stadium stadium;
}
