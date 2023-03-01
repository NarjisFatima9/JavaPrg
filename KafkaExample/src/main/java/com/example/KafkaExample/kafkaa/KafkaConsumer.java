package com.example.KafkaExample.kafkaa;

import com.example.KafkaExample.model.User;
import com.example.KafkaExample.utils.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    User userfromTopic = null;

    public User getUserfromTopic(){
        return userfromTopic;

    }
    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID,containerFactory ="concurrentKafkaListenerContainerFactory")
    public void consumemessage(User user){
        userfromTopic = user;
        LOGGER.info(String.format("Message consume ->%s",user.toString()));

    }




}
