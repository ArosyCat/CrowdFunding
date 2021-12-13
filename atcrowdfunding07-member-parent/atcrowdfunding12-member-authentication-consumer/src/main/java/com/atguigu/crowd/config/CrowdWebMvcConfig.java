package com.atguigu.crowd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zehao
 * @create 2021-11-30-15:49
 */
@Configuration
public class CrowdWebMvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器访问的地址
        String urlPath = "/auth/member/to/reg/page";
        // 目标视图的名称
        // 将来拼接application.yaml中配置的前缀“prefix”属性值和后缀“suffix”属性值，
        // 成为一个完整的视图资源访问路径去获取视图
        String viewName = "member-reg";

        registry.addViewController(urlPath).setViewName(viewName);
        registry.addViewController("/auth/member/to/login/page").setViewName("member-login");
        registry.addViewController("/auth/member/to/center/page").setViewName("member-center");
        registry.addViewController("/member/my/crowd").setViewName("member-crowd");
    }
}