/**
 * packageName: kr.co.patternbot.soccer.controllers
 * fileNa     : StadiumController
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

package kr.co.patternbot.soccer.controllers;

import kr.co.patternbot.soccer.domains.Stadium;
import kr.co.patternbot.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Stadium")
public class StadiumController {
    private final StadiumService service;

    @GetMapping("/findAll")
    public List<Stadium> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Stadium> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Stadium> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put(@RequestBody Stadium stadium) {
        return service.put(stadium);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Stadium stadium) {
        return service.delete(stadium);
    }

    @PostMapping("/join")
    public String save(@RequestBody Stadium stadium) {
        return service.save(stadium);
    }

    @GetMapping("/findById/{stadiumid}")
    public Optional<Stadium> findById(@PathVariable String stadiumid) {
        return service.findById(stadiumid);
    }

    @GetMapping("/existsById/{stadiumid}")
    public boolean existsById(@PathVariable String stadiumid) {
        return service.existsById(stadiumid);
    }
}
