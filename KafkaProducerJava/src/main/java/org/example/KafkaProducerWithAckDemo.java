package org.example;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.ArrayList;
import java.util.Properties;


public class KafkaProducerWithAckDemo {
    private static final String TOPIC_NAME="AnimalTopic";
    private static String bootstrap_server="localhost:9092";
    public static void main(String args[]) {
        KafkaProducer<String, String> kafkaProducer = null;
        try {
          //  String bootstrap_server = "localhost:9092";
            Properties property = new Properties();
            property.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap_server);
            property.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            property.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

            kafkaProducer = new KafkaProducer<>(property);
            ArrayList<String> animalList = getAnimalList();
            int i=0;
            for(String animalName:animalList)
            {
                i++;
                String Key="id" +Integer.toString(i);
                String value=animalName;
                ProducerRecord<String,String> producerRecord = new ProducerRecord<String,String> (TOPIC_NAME,Key,value);
            kafkaProducer.send(producerRecord, new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                 if(e==null) {

                     System.out.println("sucessfully received details for message ");
                     System.out.println("Topic: " + recordMetadata.topic() + "Partition: " + recordMetadata.partition() + "Offset: " + recordMetadata.offset());

                 }
                 else {
                     System.out.println("cant produce getting error" + e.getMessage());
                 }
                }
            }).get();
                System.out.println("Sucessfully send animal Names: "+value);
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


