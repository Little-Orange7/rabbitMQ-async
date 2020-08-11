package com.example.rabbitdemo.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class TestConsumerTwo implements MessageListener {
    @Override
    public void onMessage(Message message) {
        String messageJson=new String(message.getBody());
        System.out.println("ConsumerTwo  messageJson:"+messageJson);
    }
}
