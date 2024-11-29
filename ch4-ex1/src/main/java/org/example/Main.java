package org.example;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        // Without Spring boot
//        var commentRepository = new DBCommentRepository();
//        var emailNotificationProxy = new EmailNotificationProxy();
//        var commentService = new CommentService(commentRepository,emailNotificationProxy);

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("laur splica");
        comment.setText("I have written a comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}