package com.example.rabbitdemo.producer;

public interface TestProducer {
    /**
     *
     * @param routingKey 也就是队列名称，它与rabbit:bindings标签中的key必须相同
     * @param obj 传入的对象
     */
    void sendMessage(String routingKey, Object obj);
}
