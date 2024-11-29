package org.example;

import config.ProjectConfig;
import model.Parrot;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p1 = context.getBean(Parrot.class);
        Person p = context.getBean(Person.class);
        System.out.println(p);
        System.out.println(p1 == p.getParrot());
    }
}