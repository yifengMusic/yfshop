package com.yifeng.yfshop.service.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUploadApplication.class, args);
    }
}
