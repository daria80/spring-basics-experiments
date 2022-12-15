package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Cat cat1 = context.getBean("myCat",Cat.class);
//        Cat cat2 = context.getBean("myCat",Cat.class);
//
//        System.out.println("Объекты ссылаются на один и тот же объект?" + (cat1 == cat2));
//
//        System.out.println(cat1);
//        System.out.println(cat2);
//
//        Dog dog1 = context.getBean("myDog",Dog.class);
//        Dog dog2 = context.getBean("myDog",Dog.class);
//
//        dog1.setName("Belka");
//        dog2.setName("Strelka");
//
//        System.out.println("Объекты ссылаются на один и тот же объект?" + (dog1 == dog2));
//
//        System.out.println(dog1.getName());
//        System.out.println(dog2.getName());
//        context.close();
    }
}
