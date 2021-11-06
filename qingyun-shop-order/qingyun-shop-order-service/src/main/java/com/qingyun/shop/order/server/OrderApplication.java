package com.qingyun.shop.order.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Zhangzhaofa
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.qingyun.shop.order.server.mapper")
@EnableFeignClients(basePackages = {
        "com.qingyun.shop.user.api"
})
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }
}
