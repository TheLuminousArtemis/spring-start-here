package org.example;

import config.ProjectConfig;
import model.Parrot;
import model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var parrot1 = c.getBean("parrot1", Parrot.class);
        var parrot2 = c.getBean("parrot2", Parrot.class);
        var person = c.getBean(Person.class);
        System.out.println("Person: " + person);
        System.out.println("Equals to parrot2: " + (parrot2 == person.getParrot()));
        System.out.println("Equals to parrot1: " + (parrot1 == person.getParrot()));
    }
}