package com.example.rabbitdemo.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.rabbitdemo.controller.pojo.TestPojo;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;



public class TestConsumerOne implements MessageListener {

    @Override
    public void onMessage(Message message) {
        String messageJson=new String(message.getBody());
        System.out.println("Consumer  messageJson:"+messageJson);
        TestPojo tj =JSON.parseObject(messageJson, new TypeReference<TestPojo>() {});
    }
}
