package com.github.daria80.example7;

import com.github.daria80.example7.models.Fox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        System.out.println(context.getBean("fox1"));
        System.out.println(context.getBean("fox1").hashCode());
        System.out.println(context.getBean("fox1").hashCode());
    }

    @Bean(name = "fox1")
    @Scope("prototype")
    public Fox fox() {
        return new Fox("FireFox2", 1);
    }
}
