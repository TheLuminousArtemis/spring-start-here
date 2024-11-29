package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
    @Around("execution(* services.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
//        System.out.println("Something else!");
//        return "Something else";

        System.out.println("A");
        Object result = null;
        try{
            result = joinPoint.proceed();
            System.out.println("B");
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }
}
