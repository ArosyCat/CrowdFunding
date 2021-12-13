package com.atguigu.crowd;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zehao
 * @create 2021-11-29-15:53
 */
@SpringBootApplication
// 扫描MyBaits的Mapper接口所在的包
@MapperScan("com.atguigu.crowd.mapper")
public class CrowdMainClass {

    public static void main(String[] args) {
        SpringApplication.run(CrowdMainClass.class,args);
    }

}