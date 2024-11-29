package config;

import model.Parrot;
import model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        return new Parrot("Koko");
    }

    @Bean
    public Parrot parrot2(){
        return new Parrot("Choco");
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot){
        return new Person(parrot,"Ella");
    }
}
