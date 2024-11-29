package org.example;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p1 = context.getBean(Parrot.class);
        System.out.println(p1);
    }
}