package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import model.Comment;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment();
        comment.setText("Dune");
        comment.setAuthor("Paul Atreides");

        var service = c.getBean(CommentService.class);
    }
}