package org.example;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p1 = context.getBean("p1", Parrot.class);
        System.out.println(p1);
        Parrot p2 = context.getBean("p2", Parrot.class);
        System.out.println(p2);
    }
}