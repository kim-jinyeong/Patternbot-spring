/**
 * packageName: kr.co.patternbot.auth.domains
 * fileNa     : Board
 * au         : kimjinyeong
 * date       : 2022-05-18
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-18         kimjinyeong    최초 생성
 */

package kr.co.patternbot.auth.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Component
@Entity
@Table(name = "boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private long boardId;
    @Column private @NotNull String boardname;
    @Column(name = "written_date")
    @NotNull private String writtenDate;

    @OneToMany(mappedBy = "board")
    List<Article> list = new ArrayList<>();

}
