package org.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Properties;

public class KafkaProducerDemo {
    private static final String TOPIC_NAME="AnimalTopic";
    public static void main(String args[]) {
        KafkaProducer<String, String> kafkaProducer = null;
        try {
            String bootstrap_server = "localhost:9092";
            Properties property = new Properties();
            property.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap_server);
            property.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            property.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

            kafkaProducer = new KafkaProducer<>(property);
            ArrayList<String> animalList = getAnimalList();

            for (String animalname : animalList) {
                //create producer record
                ProducerRecord<String, String> record = new ProducerRecord<String, String>(TOPIC_NAME, animalname);

                //send data

                kafkaProducer.send(record);
                System.out.println("Sucessfully sended animal name=" + animalname + "To the Topic=" + TOPIC_NAME);
                Thread.sleep(4000);
            }
        }
        catch(Exception e) {
            System.out.println("Got Exception");
        }
        finally {
            if (kafkaProducer != null) {
                kafkaProducer.flush();
                kafkaProducer.close();
            }

            }
        }

        public static ArrayList<String> getAnimalList(){
        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("dog");
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Cat");
        animalList.add("Rabbit");
        return animalList;

    }

                    }

