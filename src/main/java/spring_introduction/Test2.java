package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet",Pet.class);
        Pet pet2 = context.getBean("myPet2",Pet.class);

        pet.say();
        pet2.say();

        context.close();

    }
}
