/**
 * packageName: kr.co.patternbot.soccer.services
 * fileNa     : ScheduleServiceImpl
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

import kr.co.patternbot.soccer.domains.Schedule;
import kr.co.patternbot.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService{
    private final ScheduleRepository repository;

    @Override
    public List<Schedule> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Schedule schedule) {
        return null;
    }

    @Override
    public boolean existsById(String scheduleid) {
        return repository.existsById(0L);
    }

    @Override
    public Optional<Schedule> findById(String scheduleid) {
        return repository.findById(0L);
    }

    @Override
    public String save(Schedule schedule) {
        repository.save(schedule);
        return null;
    }

    @Override
    public String delete(Schedule schedule) {
        repository.delete(schedule);
        return null;
    }
}
