package kr.co.patternbot.board.services;

import kr.co.patternbot.board.domains.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    List<Article> findAll();

    long count();

    String delete(Article article);

    String save(Article article);

    List<Article> findAll(Sort sort);

    Page<Article> findAll(Pageable pageable);
}
