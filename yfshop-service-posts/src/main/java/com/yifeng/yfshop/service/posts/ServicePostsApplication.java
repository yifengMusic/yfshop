package com.yifeng.yfshop.service.posts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.yifeng.yfshop")
@EnableEurekaClient
@MapperScan(basePackages = {"com.yifeng.yfshop.common.mapper", "com.yifeng.yfshop.service.posts.mapper"})
public class ServicePostsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicePostsApplication.class, args);
    }
}
