package dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 1、创建一个动态代理类，实现 InvocationHandler 接口
 */
public class DTest implements InvocationHandler {

    /**
     * 2、声明被代理对象
     */
    private Object o;

    /**
     * 创建代理对象
     * @param o
     * @return
     */
    public Object newIstance(Object o){

        this.o = o;

        return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),this);

    }


    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
