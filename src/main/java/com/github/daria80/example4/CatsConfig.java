package com.github.daria80.example4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatsConfig {

    @Bean
    public Cat tim() {
        return new Cat("Tim",1);
    }

    @Bean
    public Cat vim() {
        return new Cat("Vim",2);
    }
}
