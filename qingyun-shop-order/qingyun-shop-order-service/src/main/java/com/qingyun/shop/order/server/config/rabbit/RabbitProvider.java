package com.qingyun.shop.order.server.config.rabbit;

import cn.hutool.core.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;

public class RabbitProvider implements IMessage  {
    @Autowired
    StreamBridge streamBridge;
    @Override
    public void sendMethod() {
        streamBridge.send("send-in-0", IdUtil.fastUUID());
        System.out.println("************发送了message："+IdUtil.fastUUID());

    }
}
