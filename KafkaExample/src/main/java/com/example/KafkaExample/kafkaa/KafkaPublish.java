package com.example.KafkaExample.kafkaa;

import com.example.KafkaExample.model.User;
import com.example.KafkaExample.utils.AppConstants;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublish {
    private static Logger LOGGER= LoggerFactory.getLogger(KafkaPublish.class);
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(User data){
        LOGGER.info(String.format("Message Send->%s",data.toString()));
        Message<User> message= MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, AppConstants.TOPIC_NAME).build();
        kafkaTemplate.send(message);


    }

}
