package com.qingyun.shop.order.server.config;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类名称：RedisConfiguration<br>
 * 类描述：Redis配置类 <br>
 * @date 创建时间：2019-09-22 13:41<br>
 *
 * @author zhaofa
 * @version	1.0.0
*/
@Configuration
@Slf4j
public class RedissonConfiguration {

    @Bean
    public RedissonClient getRedisson(){
        Config config = new Config();
        //单机模式  依次设置redis地址和密码
        config.useSingleServer().
                setAddress("redis://192.168.1.20:6379");
        return Redisson.create(config);
    }
    
}
