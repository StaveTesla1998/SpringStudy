package com.qiji.spring.proxy;

import org.junit.Test;

public class StaticProxyTest {
    @Test
    public void staticProxyTest(){
        CalculatorStaticProxy staticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        staticProxy.add(1,2);
    }
}
