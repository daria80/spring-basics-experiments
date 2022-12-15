package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myDog",Dog.class);
        Dog dog2 = context.getBean("myDog",Dog.class);

        dog.say();
        dog2.say();

        context.close();

    }
}
