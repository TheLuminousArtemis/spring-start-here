package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import model.Comment;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment("Dune", "Paul Atreides");
        var service = c.getBean(CommentService.class);
        service.publishComment(comment);
    }
}