package com.git.controller;

import com.git.domain.BaseResponse;
import com.git.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @Autowired
    private KafkaService kafkaService;

    @RequestMapping("send")
    @ResponseBody
    public BaseResponse send(String topic, String msg) {
        kafkaService.send(topic, msg);
        return BaseResponse.SUCCESSFUL();
    }

    @RequestMapping("insert")
    @ResponseBody
    public BaseResponse insert() {
        return BaseResponse.SUCCESSFUL();
    }

}
