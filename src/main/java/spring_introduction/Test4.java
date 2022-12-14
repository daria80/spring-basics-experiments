package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat cat1 = context.getBean("myCat",Cat.class);
        Cat cat2 = context.getBean("myCat",Cat.class);

        System.out.println("Объекты ссылаются на один и тот же объект?" + (cat1 == cat2));

        System.out.println(cat1);
        System.out.println(cat2);
    }
}
