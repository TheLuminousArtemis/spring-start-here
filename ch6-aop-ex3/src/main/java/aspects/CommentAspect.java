package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import model.Comment;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CommentAspect {
    private Logger logger = Logger.getLogger(CommentAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method: " + methodName +"\n" + "Arguments: " + Arrays.asList(arguments));

        var newComment = new Comment();
        newComment.setAuthor("Matt");
        newComment.setText("Protect the city");
        Object[] newArguments = {newComment};

        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Method executed and returned: " + returnedByMethod);
        return "FAILED";
    }
}
