package com.qiji.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * jdk方式的动态代理
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        /*
        ClassLoader loader:类加载器
        Class<?>[] interfaces:目标对象实现的所有接口的class对象所组成的数组
        InvocationHandler h:代理类中如何重写接口中的方法
        */
        ClassLoader loader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result=null;
                try {
                    System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                } catch (Exception e) {
                    System.out.println("异常报错");
                    e.printStackTrace();
                } finally {
                    System.out.println("动态代理处理结束");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(loader, interfaces, h);
    }
}
