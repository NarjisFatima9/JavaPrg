package com.example.CurrencyExchange.service;

import com.example.CurrencyExchange.module.CurrencyConverter;
import com.example.CurrencyExchange.repository.CurrencyConverterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterService {

    @Value("${server.port}")
    public String port;
@Autowired
 CurrencyConverterRepository currencyConverterRepository;

    public CurrencyConverter getCurrencyExchange(String from, String to) {

    CurrencyConverter currencyConverter=currencyConverterRepository.findByCurrencyFromAndCurrencyTo(from, to);
    currencyConverter.setPort(Integer.parseInt(port));
    return currencyConverter;

    }

    public void createCurrencyExchange(CurrencyConverter currencyConverter) {

        currencyConverterRepository.save(currencyConverter);
    }
}
