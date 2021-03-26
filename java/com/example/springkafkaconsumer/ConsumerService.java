package com.example.springkafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "message-topic")
    public void consumeMessage(String message){
        System.out.println("Received Message: " + message);
    }
}
