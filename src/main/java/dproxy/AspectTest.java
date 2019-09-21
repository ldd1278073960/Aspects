package dproxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 *
 * @Component  在spring中进行注册
 * @Aspect     声明这是一个切面类
 */
@Component
@Aspect
public class AspectTest {

    //定义一个切入点，切入点不能有返回值，不能私有化

    /**
     *
     */
    @Pointcut("execution(* dproxy.*(..))")
    public void heXin(){
        System.out.println("这是核心方法");
    }

}
