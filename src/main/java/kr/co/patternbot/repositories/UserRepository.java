package kr.co.patternbot.repositories;

import kr.co.patternbot.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void put(User user);

    String login(User user);
}
