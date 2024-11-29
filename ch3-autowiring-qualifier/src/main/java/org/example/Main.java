package org.example;

import config.ProjectConfig;
import model.Parrot;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot1 = context.getBean("p1", Parrot.class);
        Parrot parrot2 = context.getBean("p2", Parrot.class);
        Person person =  context.getBean(Person.class);
        System.out.println(Person.class);
        System.out.println(parrot1 == person.getParrot());
        System.out.println(parrot2 == person.getParrot());

    }
}