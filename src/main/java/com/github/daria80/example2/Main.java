package com.github.daria80.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    @Bean
    public Car tesla() {
        return new Car("Tesla",2020);
    }

    @Bean
    public Car audi() {
        return new Car("Audi",2017);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.github.daria80.example2");
        System.out.println(context.getBean("tesla", Car.class));
        System.out.println(context.getBean("audi", Car.class));
        System.out.println(context.getBean("niva", Car.class));
        System.out.println(context.getBean("lada", Car.class));

    }
}
