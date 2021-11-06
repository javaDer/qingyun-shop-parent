package com.qingyun.shop.order.server.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

@Slf4j
@Configuration
public class RabbitMQConfiguration {
    @Autowired
    private StreamBridge streamBridge;

    @Bean
    public Function<Map<String, List<String>>, String> testStreamBridge() {
        //map是http传参数 是一个Map，也可以是对象；
        return city -> {
            //封装需要发送的Message对象
            Message<Map<String, List<String>>> message = MessageBuilder.withPayload(city)
                    //设置头信息partitionKey：因为我有2个消费者，这个配置就是决定这条消息的消费者是哪个
                    .setHeader("partitionKey", 1)
                    .build();
            //streamBridge发送消息：myGenerate-out-0 是yml绑定的mq message就是消息
            boolean sendStatus = streamBridge.send("myGenerate-out-0", message, MediaType.APPLICATION_JSON);
            if (sendStatus) {
                return "success";
            } else {
                return "false";
            }
        };
    }
}
