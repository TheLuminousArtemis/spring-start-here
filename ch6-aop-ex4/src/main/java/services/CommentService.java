package services;

import java.util.logging.Logger;

import annotations.ToLog;
import model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public void publishComment(Comment comment){
        logger.info("Comment: " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting Comment: " + comment.getText());
    }

    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getText());
    }
}
