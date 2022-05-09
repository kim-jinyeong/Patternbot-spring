/**
 * packageName: kr.co.patternbot.soccer.domains
 * fileNa     : Payer
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

@Data
@Component
@Entity
public class Player {
    @Id String playerId;
    private String playerName;
    private String teamId;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String position;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;
}
