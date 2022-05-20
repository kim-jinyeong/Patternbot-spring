package kr.co.patternbot.soccer.repositories;

import kr.co.patternbot.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface PlayerCustomRepository{

}

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>,PlayerCustomRepository {
}
