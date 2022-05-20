/**
 * packageName: kr.co.patternbot.services
 * fileNa     : UserRepositoryImpl
 * au         : kimjinyeong
 * date       : 2022-05-03
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03         kimjinyeong    최초 생성
 */

package kr.co.patternbot.auth.services;

import kr.co.patternbot.auth.domains.User;
import kr.co.patternbot.auth.repositories.UserRepository;
import kr.co.patternbot.common.dataStructure.Box;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public String login(User user) {
        //repository.login(user);
        return "";
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return repository.findAll();
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(User user) {
       // repository.put(user);
        return "";
    }

    @Override
    public String delete(User user) {
        repository.delete(user);
        return "";
    }

    @Override
    public String save(User user) {
        repository.save(user);
        return null;
    }

    @Override
    public Optional<User> findById(String userid) {
        return repository.findById(0L); // userid 타입이 다름
    }

    @Override
    public boolean existsById(String userid) {
        return repository.existsById(0L); // userid 타입이 다름
    }

    @Override
    public List<User>findByUserName(String name){
        List<User> ls = repository.findAll();
        Box<String, User> box = new Box<>();
        return null;
    }
}
