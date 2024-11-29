package aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
    @Before("execution(* services.*.*(..))")
    public void before(){
        System.out.println("A");
    }

    @After("execution(* services.*.*(..))")
    public void after(){
        System.out.println("B");
    }

    @AfterReturning("execution(* services.*.*(..))")
    public void afterReturning(){
        System.out.println("C");
    }

    @AfterThrowing("execution(* services.*.*(..))")
    public void afterThrowing(){
        System.out.println("D");
    }

}
