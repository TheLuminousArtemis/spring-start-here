package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"services", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
