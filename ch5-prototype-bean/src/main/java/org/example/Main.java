package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var b1 = c.getBean("commentService", CommentService.class);
        var b2 = c.getBean("commentService", CommentService.class);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}