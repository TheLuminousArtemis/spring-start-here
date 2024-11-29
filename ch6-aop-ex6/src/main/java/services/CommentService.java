package services;

import annotations.ToLog;
import org.springframework.stereotype.Service;
import model.Comment;
import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Comment published: " + comment.getText());
        return "SUCCESS";
    }
}
