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


import com.sun.istack.NotNull;
import kr.co.patternbot.user.domains.User;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "articles")
public class Article {
    @Id @Column(name = "article_id") @GeneratedValue private long articleId;
    @Column @NotNull private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;
}
