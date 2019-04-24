package com.yifeng.yfshop.common.web.config;


import com.yifeng.yfshop.common.web.interceptor.ConstantsInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public ConstantsInterceptor constantsInterceptor() {
        return new ConstantsInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 常量拦截器
        registry.addInterceptor(constantsInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**");
    }
}
