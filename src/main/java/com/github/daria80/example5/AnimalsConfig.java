package com.github.daria80.example5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalsConfig {

    @Bean
    public Animal fox() {
        return new Animal("Fox",1);
    }

    @Bean
    public Animal squirrel() {
        return new Animal("Squirrel",2);
    }
}
