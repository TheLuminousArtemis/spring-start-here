package config;

import model.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.stream.events.Comment;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentService commentService(){
        var commentService = new CommentService();
        return commentService;
    }

}

