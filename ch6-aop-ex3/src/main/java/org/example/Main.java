package org.example;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment();
        comment.setAuthor("Paul Atreides");
        comment.setText("Dune");
        var service = c.getBean(CommentService.class);
        String values = service.publishComment(comment);
        logger.info(values);
    }
}