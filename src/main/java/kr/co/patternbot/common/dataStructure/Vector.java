/**
 * packageName: kr.co.patternbot.common.dataStructure
 * fileNa     : Box
 * au         : kimjinyeong
 * date       : 2022-05-12
 * desc       :
 * class variable :
 * instance variable :
 * area variable :
 * parameter :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-12         kimjinyeong    최초 생성
 */

package kr.co.patternbot.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@Lazy
public class Box <T>{
    private ArrayList<T> list ;

    public Box(){this.list = new ArrayList<>();}

    public void add(T t){
        list.add(t);
    }

    public void set(int i, T t){
        list.set(i,t);
    }
    public void remove(T t){
        list.remove(t);
    }
    public ArrayList<T> findAll(){
        return list;
    }
    public T findById(int i){
        return list.get(i);
    }
    public int count(){
        return list.size();
    }
    public void clear(){
        list.clear();
    }

}
