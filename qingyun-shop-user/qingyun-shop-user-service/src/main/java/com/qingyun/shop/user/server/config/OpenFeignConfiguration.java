package com.qingyun.shop.user.server.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zhangzhaofa
 */
@Configuration
public class OpenFeignConfiguration {
    @Bean
    Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }
}
