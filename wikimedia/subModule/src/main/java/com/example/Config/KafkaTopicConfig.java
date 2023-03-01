package com.example.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public static NewTopic newTopic(){
        return TopicBuilder.name("wikimedia_recentChanges").build();

    }
}
