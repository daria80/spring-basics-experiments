package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Dog implements Pet {
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("class Dog init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("class Dog destroy method");
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
