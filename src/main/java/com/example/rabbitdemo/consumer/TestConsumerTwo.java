package com.example.rabbitdemo.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class TestConsumerTwo implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("message.getBody():"+message.getBody());
    }
}
