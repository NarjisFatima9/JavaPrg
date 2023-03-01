package com.example.KafkaExample.config;

import com.example.KafkaExample.model.User;
import com.example.KafkaExample.utils.AppConstants;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {
    @Bean
    public ConsumerFactory<String, Object> consumerFactory(){
        Map map1=new HashMap<String, Object>();
        map1.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        map1.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        map1.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        map1.put(ConsumerConfig.GROUP_ID_CONFIG, AppConstants.GROUP_ID);
        return new DefaultKafkaConsumerFactory<>(map1,new StringDeserializer(),new JsonDeserializer<>(User.class));

    }
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, User> concurrentKafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, User> factory= new ConcurrentKafkaListenerContainerFactory<String,User>();
        factory.setConsumerFactory(consumerFactory());
        return factory;


    }

}
