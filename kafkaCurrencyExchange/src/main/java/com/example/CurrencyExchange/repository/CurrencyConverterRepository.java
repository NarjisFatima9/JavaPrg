package com.example.CurrencyExchange.repository;

import com.example.CurrencyExchange.module.CurrencyConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CurrencyConverterRepository extends JpaRepository<CurrencyConverter, Integer> {
        CurrencyConverter findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);


}
