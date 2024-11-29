package config;
import model.Parrot;
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
    public Parrot p2(){
        Parrot p2 = new Parrot();
        p2.setName("Choco");
        return p2;
    }
}
