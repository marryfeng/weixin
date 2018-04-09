package com.weixin.learning;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fengli on 2018/4/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class LogTest2 {

    @Test
    public void testtwo(){
        log.info("hello");
    }
}
