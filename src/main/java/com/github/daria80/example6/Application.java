package com.github.daria80.example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(Application.class);

        context.getBean("demo");


    }
}
