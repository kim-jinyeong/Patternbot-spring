package kr.co.patternbot.soccer.services;

import kr.co.patternbot.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {
    List<Schedule> findAll();

    List<Schedule> findAll(Sort sort);

    Page<Schedule> findAll(Pageable pageable);

    long count();

    String put(Schedule schedule);

    boolean existsById(String scheduleid);

    Optional<Schedule> findById(String scheduleid);

    String save(Schedule schedule);

    String delete(Schedule schedule);
}
