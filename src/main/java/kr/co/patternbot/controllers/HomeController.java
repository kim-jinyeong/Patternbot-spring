/**
* packageName: kr.co.patternbot.controllers
* fileNa     : Home
* au         : kimjinyeong
* date       : 2022-05-03
* desc       :
* class variable :
*instance variable :
* area variable :
* parameter :
* ================================
*  DATE              AUTHOR        NOTE
* ================================
*  2022-05-03         kimjinyeong    최초 생성
*/

package kr.co.patternbot.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String now(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
