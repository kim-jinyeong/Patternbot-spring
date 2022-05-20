/**
 * packageName: kr.co.patternbot.soccer.services
 * fileNa     : PlayerServiceImpl
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

package kr.co.patternbot.soccer.services;

import kr.co.patternbot.soccer.domains.Player;
import kr.co.patternbot.soccer.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    private final PlayerRepository repository;

    @Override
    public List<Player> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Player player) {
        //repository.put(player);
        return "";
    }

    @Override
    public String delete(Player player) {
        repository.delete(player);
        return null;
    }

    @Override
    public String save(Player player) {
        repository.save(player);
        return null;
    }

    @Override
    public Optional<Player> findById(String playerid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String playerid) {
        return repository.existsById(0L);
    }

    @Override
    public List<Player> findAll(Sort sort) {
        return repository.findAll();
    }

    @Override
    public Page<Player> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
