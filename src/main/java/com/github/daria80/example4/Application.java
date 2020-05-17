package com.github.daria80.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.github.daria80.example4");
        System.out.println(context.getBean("tim"));
        System.out.println(context.getBean("vim"));
    }
}
