package com.github.daria80.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.github.daria80.example5");
        System.out.println(context.getBean("squirrel"));
        System.out.println(context.getBean("fox"));

    }

}
