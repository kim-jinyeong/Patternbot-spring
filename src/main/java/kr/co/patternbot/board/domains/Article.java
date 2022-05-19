/**
 * packageName: kr.co.patternbot.board.domains
 * fileNa     : Article
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

package kr.co.patternbot.board.domains;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Component
@Entity
@Table(name = "")
public class Article {
    @Id Long id;
    private String projects;
    private String startDate;
    private String status;
    private String team;
    private String progerss;
    private String action;
}
