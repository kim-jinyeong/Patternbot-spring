/**
 * packageName: kr.co.patternbot.board.controllers
 * fileNa     : ArticleController
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

package kr.co.patternbot.board.controllers;

import kr.co.patternbot.board.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import kr.co.patternbot.board.domains.Article;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService service;

    @GetMapping("/findAll")
    public List<Article> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Article> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Article> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Article article) {
        return service.delete(article);
    }

    @PostMapping("/join")
    public String save(@RequestBody Article article) {
        return service.save(article);
    }

}
