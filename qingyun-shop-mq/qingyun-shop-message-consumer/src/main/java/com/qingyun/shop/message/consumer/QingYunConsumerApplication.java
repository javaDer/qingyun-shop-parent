package com.qingyun.shop.message.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Zhangzhaofa
 */
@SpringBootApplication
@EnableDiscoveryClient
public class QingYunConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(QingYunConsumerApplication.class, args);
    }

}
