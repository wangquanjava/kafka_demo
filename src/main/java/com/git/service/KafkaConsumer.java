package com.git.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

/**
 * Created by wqquan.wang on 2018/4/18.
 */
public class KafkaConsumer implements MessageListener<Integer, String> {

    public void onMessage(ConsumerRecord<Integer, String> record) {
        System.out.println(record);
    }

}