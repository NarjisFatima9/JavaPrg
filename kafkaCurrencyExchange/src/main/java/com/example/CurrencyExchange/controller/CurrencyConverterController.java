package com.example.CurrencyExchange.controller;

import com.example.CurrencyExchange.module.CurrencyConverter;
import com.example.CurrencyExchange.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CurrencyConverterController {
    @Autowired
CurrencyConverterService currencyConverterService;
@GetMapping("/currency-exchange/from/{from}/to/{to}")

    public CurrencyConverter getCurrencyExchange(@PathVariable String from, @PathVariable String to){
        return currencyConverterService.getCurrencyExchange(from, to);
    }
    @PostMapping("/creater")
        public void createCurrencyExchange(@RequestBody CurrencyConverter currencyConverter){
    currencyConverterService.createCurrencyExchange(currencyConverter);
    ResponseEntity.ok(currencyConverter);



    }
}
