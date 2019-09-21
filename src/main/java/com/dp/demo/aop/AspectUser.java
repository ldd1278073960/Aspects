package com.dp.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 注册到spring中
 */
@Component
/**
 * 声明类是切面类
 * @author Administrator
 */
@Aspect
public class AspectUser {

    //定义切入点，方法必须是公开的，且不能私有化方法

    @Pointcut("execution(* com.dp.demo.aop.User2.save(..))")
    public void pointcutUser(){

    }

    //前置通知

    @Before("pointcutUser()")
    public void before(){
        System.out.println("前置通知");
    }

    //后置通知

    @AfterReturning("pointcutUser()")
    public void afterReturning(){
        System.out.println("后置通知");
    }


    /**
     * 环绕通知
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("pointcutUser()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后通知");
        return proceed;
    }

    /**
     * 最终通知
     * @param joinPoint
     */
    @After("pointcutUser()")
    public void after(JoinPoint joinPoint){
        System.out.println("最终通知" + joinPoint.getSignature().getName());

    }
}
