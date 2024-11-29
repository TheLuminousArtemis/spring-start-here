package org.example;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


public class Main {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerBean("parrot1", Parrot.class, () -> new Parrot("Koko"));
        context.registerBean("parrot2", Parrot.class, () -> new Parrot("Choco"));

        context.refresh();
        System.out.println(context.getBean("parrot1", Parrot.class));
        System.out.println(context.getBean("parrot2", Parrot.class));

        context.close();
    }
}