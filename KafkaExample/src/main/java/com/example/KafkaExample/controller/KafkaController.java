package com.example.KafkaExample.controller;

import com.example.KafkaExample.kafkaa.KafkaConsumer;
import com.example.KafkaExample.kafkaa.KafkaPublish;
import com.example.KafkaExample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
    @Autowired
    KafkaPublish kafkaPublish;
    @Autowired
    KafkaConsumer kafkaConsumer;
    @PostMapping("/publish")
    public ResponseEntity produceMessage(@RequestBody User user){

        kafkaPublish.sendMessage(user);
        return ResponseEntity.ok("Message published");

    }
    @GetMapping("/consume")

    public ResponseEntity consumeMessage(){
        return ResponseEntity.ok(kafkaConsumer.getUserfromTopic());
    }
}
