package com.example.KafkaExample.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;
}
