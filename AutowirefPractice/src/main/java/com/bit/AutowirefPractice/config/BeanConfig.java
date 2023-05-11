package com.bit.AutowirefPractice.config;


import com.bit.AutowirefPractice.Bank;
import com.bit.AutowirefPractice.Trader;
import com.bit.AutowirefPractice.implementation.EximBank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public EximBank eximBank() {
        return new EximBank(001, 88001, 12000);
    }



    @Bean
    public Trader trader1(Bank bank) {
        return new Trader("Rahat Ibna Hossain", "Dhaka", bank);
    }
}
