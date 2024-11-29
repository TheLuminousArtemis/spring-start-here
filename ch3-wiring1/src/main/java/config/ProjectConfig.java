package config;

import model.Parrot;
import model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot p1(){
        Parrot p = new Parrot("Koko");
        return p;
    }

    @Bean
    public Person p(){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(p1());
        return p;
    }

}
