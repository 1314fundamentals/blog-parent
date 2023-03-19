package com.fsy.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: FSY
 * DateTime: 2023-03-20 0:11
 */
public class WebMVCConfig implements WebMvcConfigurer {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //添加域名映射
        //允许8080接口访问我们服务器8888接口
        registry.addMapping("/**").allowedOrigins("http://localhost:8080");
    }
}
