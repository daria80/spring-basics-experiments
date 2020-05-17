package com.github.daria80.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public Car niva() {
        return new Car("Niva",2010);
    }

    @Bean
    public Car lada() {
        return new Car("Lada",2000);
    }
}
