package org.example;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.metrics.stats.Value;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumerDemo {
    private static final String TOPIC_NAME="AnimalTopic";

    //create property object for consumer configuration

    public static void main(String args[]){
        String bootstrap_server = "localhost:9092";
        String groupId = "group1";

        Properties property= new Properties();
        property.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrap_server);
        property.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        property.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        property.setProperty(ConsumerConfig.GROUP_ID_CONFIG,groupId);

        property.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");

        //create consumer

        KafkaConsumer<String,String> kafkaConsumer = new KafkaConsumer<String, String>(property);

        kafkaConsumer.subscribe(Arrays.asList(TOPIC_NAME));

        try {
            while (true) {
                ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofMillis(100));
                for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                    System.out.println("Key: " + consumerRecord.key() + "Value:" + consumerRecord.value());
                    System.out.println("Partition:" + consumerRecord.partition() + "offset:" + consumerRecord.offset());

                }
            }
        }
            catch(Exception e){
                System.out.println("got Exception");
            }
                    finally {
            kafkaConsumer.close();
            System.out.println("Consumer close");
        }

        }


    }