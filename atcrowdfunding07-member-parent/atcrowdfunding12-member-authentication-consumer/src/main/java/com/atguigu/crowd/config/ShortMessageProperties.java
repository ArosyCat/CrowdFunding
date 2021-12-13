package com.atguigu.crowd.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zehao
 * @create 2021-11-30-16:58
 */
@Component
@ConfigurationProperties(prefix = "short.message")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EnableConfigurationProperties(ShortMessageProperties.class)
public class ShortMessageProperties {

    private String host;

    private String path;

    private String appcode;

    private String sign;

    private String skin;

}