package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import model.Comment;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        var comment = new Comment();
        comment.setText("Demo Comment");
        comment.setAuthor("Paul Atreides");
        service.publishComment(comment);
    }
}