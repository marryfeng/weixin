package com.weixin.learning;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fengli on 2018/4/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//使用了该注解就不用传统的logFactory声明log了,如何在日志中输出变量
@Slf4j
//@Data
public class LoggerTest {



    @Test
    public void testone(){
        String name="hello";
        String pwd="123";
        //推荐使用这种方式来使用日志读取变量
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);
        log.info("name: {},pwd: {}",name,pwd);

        log.info("info............");
        log.info("debug...........");
    }
}
