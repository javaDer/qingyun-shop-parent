package com.qingyun.shop.message.consumer.mq;

import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ReceiveService {
    @Bean
    public Consumer<Message<String>> consumerEvent() {
        return message -> System.out.println(message.getPayload());
    }
}
