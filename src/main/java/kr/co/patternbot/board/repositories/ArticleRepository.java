package kr.co.patternbot.board.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.co.patternbot.board.domains.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
