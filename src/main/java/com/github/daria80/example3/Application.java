package com.github.daria80.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("sheeps.xml");

        System.out.println(context.getBean("sheep1"));
        System.out.println(context.getBean("sheep2"));


    }
}
