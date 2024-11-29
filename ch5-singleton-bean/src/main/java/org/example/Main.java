package org.example;

import config.ProjectConfig;
import model.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var b1 = c.getBean("commentService", CommentService.class);
        var b2 = c.getBean("commentService", CommentService.class);

        System.out.println(b1==b2);
    }
}