package com.example.CurrencyExchange.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyConverter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @NoArgsConstructor
    private int id;
    private String currencyFrom;
    private String currencyTo;
    private float conversionRate;
    private int port;
}
