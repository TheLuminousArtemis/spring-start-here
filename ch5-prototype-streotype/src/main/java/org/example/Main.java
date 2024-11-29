package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var b1 = c.getBean(UserService.class);
        var b2 = c.getBean(CommentService.class);

        System.out.println(b1.getCommentRepository());
        System.out.println(b2.getCommentRepository());
        System.out.println(b1.getCommentRepository() == b2.getCommentRepository());
    }
}