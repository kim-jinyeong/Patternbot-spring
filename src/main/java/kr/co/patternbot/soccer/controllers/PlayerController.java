/**
 * packageName: kr.co.patternbot.soccer.controllers
 * fileNa     : PayerController
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

import kr.co.patternbot.soccer.domains.Player;
import kr.co.patternbot.soccer.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Player")
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/findAll")
    public List<Player> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Player> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Player> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put(@RequestBody Player Player) {
        return service.put(Player);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Player Player) {
        return service.delete(Player);
    }

    @PostMapping("/join")
    public String save(@RequestBody Player Player) {
        return service.save(Player);
    }

    @GetMapping("/findById/{playerid}")
    public Optional<Player> findById(@PathVariable String playerid) {
        return service.findById(playerid);
    }

    @GetMapping("/existsById/{playerid}")
    public boolean existsById(@PathVariable String playerid) {
        return service.existsById(playerid);
    }

}
