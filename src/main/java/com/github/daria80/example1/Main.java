package com.github.daria80.example1;

import com.github.daria80.example1.services.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // объявили контекст Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        BookService service = (BookService) context.getBean("restaurant");


        // получаем из контекста бин под идентификатором userA
        User user = (User) context.getBean("userA");
        user.play();
        System.out.println(user);

        // получаем из контекста бин под идентификатором userB
        User user2 = (User) context.getBean("userB");
        user2.play();
        System.out.println(user2);


        service.checkPlace(1);// false
        System.out.println(service.book(user));//0
        System.out.println(service.book(user2));//2
        service.checkPlace(1);// true


    }
}
