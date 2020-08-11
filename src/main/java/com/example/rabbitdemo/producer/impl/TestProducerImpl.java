package com.example.rabbitdemo.producer.impl;

import com.example.rabbitdemo.producer.TestProducer;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class TestProducerImpl implements TestProducer {

    //由配置文件配置方式注入
    private AmqpTemplate amqpTemplate;

    public AmqpTemplate getAmqpTemplate() {
        return amqpTemplate;
    }

    public void setAmqpTemplate(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    private void send(String routingKey, String json){
        System.out.println("--------------Producer-----start-------");
        System.out.println("routingKey:"+routingKey+",json:"+json);
        amqpTemplate.convertAndSend(routingKey,json);
        System.out.println("--------------Producer------end------");
    }

    @Override
    public void sendMessage(String routingKey, String json) {
        send(routingKey,json);
    }
}
