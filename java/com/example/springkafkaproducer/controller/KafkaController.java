package com.example.springkafkaproducer.controller;

import com.example.springkafkaproducer.model.Message;
import com.example.springkafkaproducer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("publish")
    public void publishMessage(@RequestBody Message msg){
        kafkaProducerService.sendMessage(msg);
    }
}
