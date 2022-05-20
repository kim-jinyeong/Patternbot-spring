/**
 * packageName: kr.co.patternbot.soccer.services
 * fileNa     : StadiumServiceImpl
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

import kr.co.patternbot.soccer.domains.Stadium;
import kr.co.patternbot.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService{
    private final StadiumRepository repository;

    @Override
    public List<Stadium> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Stadium> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Stadium> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Stadium stadium) {
        return null;
    }

    @Override
    public String delete(Stadium stadium) {
        repository.delete(stadium);
        return null;
    }

    @Override
    public String save(Stadium stadium) {
        repository.save(stadium);
        return null;
    }

    @Override
    public Optional<Stadium> findById(String stadiumid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String stadiumid) {
        return repository.existsById(0L);
    }
}
