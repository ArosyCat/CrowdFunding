package com.atguigu.crowd.test;

import com.atguigu.crowd.api.RedisRemoteService;
import com.atguigu.crowd.util.ResultEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author zehao
 * @create 2021-11-30-20:25
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class RedisTest {

    @Autowired
    private RedisRemoteService redisRemoteService;

    @Test
    public void testRedisRemote(){
        ResultEntity<String> resultEntity = redisRemoteService.setRedisKeyValue("hhhhh", "wwwwww");
        String result = resultEntity.getResult();
        if ("SUCCESS".equals(result)) {
            log.info("成功执行Redis存储！");
        }
    }

    @Test
    public void testRedisRemoteWithTimeout() {
        ResultEntity<String> resultEntity = redisRemoteService.setRedisKeyValueRemoteWithTimeout("haha", "hehe", 15, TimeUnit.MINUTES);
        String result = resultEntity.getResult();
        if (result.equals("SUCCESS")) {
            log.info("成功执行Redis存储！");
        }
    }

}