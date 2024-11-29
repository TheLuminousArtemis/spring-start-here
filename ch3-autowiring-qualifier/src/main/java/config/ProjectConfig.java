package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"model"})
public class ProjectConfig {
    @Bean
    public Parrot p1(){
        return new Parrot("Koko");
    }

    @Bean
    public Parrot p2(){
        Parrot p = new Parrot("Choco");
        return p;
    }
}
