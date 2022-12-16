package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    @Autowired
    public void setPet(@Qualifier("catBean") Pet pet) {
        System.out.println("class Person: set pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println("class Person: set surname");
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        System.out.println("class Person: set age");
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet! ");
        pet.say();
    }
}
