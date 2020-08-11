package com.example.rabbitdemo.producer;

public interface TestProducer {
    /**
     *
     * @param routingKey 也就是队列名称，它与rabbit:bindings标签中的key必须相同
     * @param json 由对象转换成的json字符串
     */
    void sendMessage(String routingKey, String json);
}
