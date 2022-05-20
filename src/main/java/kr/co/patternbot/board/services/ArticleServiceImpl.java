/**
 * packageName: kr.co.patternbot.board.services
 * fileNa     : ArticleServiceImpl
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

package kr.co.patternbot.board.services;

import kr.co.patternbot.board.domains.Article2;
import kr.co.patternbot.board.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{
    private final ArticleRepository repository;

    @Override
    public List<Article2> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Article2 article) {
        repository.delete(article);
        return "";
    }

    @Override
    public String save(Article2 article) {
        repository.save(article);
        return null;
    }

    @Override
    public List<Article2> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Article2> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
