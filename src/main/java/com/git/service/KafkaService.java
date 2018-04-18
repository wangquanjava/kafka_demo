package com.git.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by wqquan.wang on 2018/4/18.
 */
@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    public void send(String topic, String msg) {
        kafkaTemplate.send(topic, msg);
    }


}
