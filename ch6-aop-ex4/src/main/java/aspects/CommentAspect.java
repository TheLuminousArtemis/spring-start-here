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
    @Around("@annotation(annotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method: " + methodName +"\n" + "Arguments: " + Arrays.asList(arguments));
        Object returned = joinPoint.proceed();
        logger.info("Method executed and returned: " + returned);
        return returned;
    }
}
