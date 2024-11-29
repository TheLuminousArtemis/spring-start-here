package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import model.Parrot;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot p1(){
        Parrot p = new Parrot("Koko");
        return p;
    }
}

