package kr.co.patternbot.soccer.services;

import kr.co.patternbot.soccer.domains.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> findAll();

    long count();

    String put(Player player);

    String delete(Player player);

    String save(Player player);

    Optional<Player> findById(String playerid);

    boolean existsById(String playerid);

    List<Player> findAll(Sort sort);

    Page<Player> findAll(Pageable pageable);
}
