package services;

import org.springframework.stereotype.Service;
import model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Comment: " + comment.getText());
        return "SUCCESS";
    }
}
