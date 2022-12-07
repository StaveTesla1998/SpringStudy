package com.qiji.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CalculatorAspect {
    @Pointcut("execution(* com.qiji.spring.aop.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeMethod(@NotNull JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名："+methodName+"，参数："+args);
    }
    @After("pointCut()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        String args=Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->后置通知，方法名："+methodName+"，参数："+args);
    }

    /**
     * 返回通知
     * @param point
     */
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturning(JoinPoint point,Object result){
        String methodName=point.getSignature().getName();
        String args=Arrays.toString(point.getArgs());
        System.out.println("Logger-->返回通知，方法名："+methodName+"，参数："+args+"结果:"+result);
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        String methodName=joinPoint.getSignature().getName();
        String args=Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->返回通知，方法名："+methodName+"，参数："+args+"异常信息:"+ex);
    }

    /**
     * 环绕通知
     * @param joinPoint
     */
    @Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->环绕通知，方法名："+methodName+"，参数："+args);
        Object result=null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            result=joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        }finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
}
