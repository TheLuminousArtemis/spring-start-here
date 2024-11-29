package config;

import model.Parrot;
import model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot p1(){
        Parrot p = new Parrot("Koko");
        return p;
    }

    @Bean
    public Person p(Parrot parrot){
        Person p = new Person();
        p.setParrot(parrot);
        p.setName("Ella");
        return p;
    }
}
