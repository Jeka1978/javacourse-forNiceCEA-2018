package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Pointcut("@annotation(Deprecated)")
    public void deprecatedMethods(){}

    @Pointcut("execution(* quoters..*.say*(..))")
    public void allSayMethods(){}

    @Before("allSayMethods() && deprecatedMethods()")
    public void handleSayMethods(JoinPoint jp){
        System.out.println("this is quote of "+jp.getTarget().getClass().getSimpleName());
    }
}
