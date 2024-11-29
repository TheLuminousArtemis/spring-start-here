package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint){
        logger.info("Method starting");
        try{
            joinPoint.proceed();
        }
        catch (Throwable throwable){
            throwable.printStackTrace();
        }
        finally {
            logger.info("Method finished");
        }
    }
}
