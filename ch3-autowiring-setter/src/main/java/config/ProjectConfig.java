package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "model")
public class ProjectConfig {
    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot("Koko");
        return p;
    }

}
