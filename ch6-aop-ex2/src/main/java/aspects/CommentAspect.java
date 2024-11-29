 package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CommentAspect {
    private Logger logger = Logger.getLogger(CommentAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();

        Object[] arguments = joinPoint.getArgs();

        logger.info("Method name" + methodName + " with parameters" + Arrays.asList(arguments));
        Object returned = joinPoint.proceed();
        logger.info("Returned: " + returned);
        return returned;
    }
}
