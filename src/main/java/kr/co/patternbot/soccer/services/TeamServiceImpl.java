/**
 * packageName: kr.co.patternbot.soccer.services
 * fileNa     : TeamServiceImpl
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

import kr.co.patternbot.soccer.domains.Team;
import kr.co.patternbot.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;

    @Override
    public List<Team> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Team team) {
        return null;
    }

    @Override
    public String delete(Team team) {
        repository.delete(team);
        return"";
    }

    @Override
    public String save(Team team) {
        repository.save(team);
        return "";
    }

    @Override
    public Optional<Team> findById(String teamid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String teamid) {
        return repository.existsById(0L);
    }
}
