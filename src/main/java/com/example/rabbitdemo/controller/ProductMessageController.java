package com.example.rabbitdemo.controller;

import com.alibaba.fastjson.JSON;
import com.example.rabbitdemo.controller.pojo.TestPojo;
import com.example.rabbitdemo.producer.TestProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class ProductMessageController {

    @Resource
    private TestProducer testProducer;

    @Value("${routingKey.one}")
    private String routingKey;

    @GetMapping("/pushMessage")
    public String productMessage(){
        TestPojo tp=new TestPojo();
        tp.setName("Jack");
        tp.setLogin("JackLogin");
        tp.setPassword("123456");
        tp.setAge(20);
        System.out.println("Controller");
        testProducer.sendMessage(routingKey,tp);
        return "OK";
    }

}
