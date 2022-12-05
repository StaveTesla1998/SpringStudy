package com.qiji.spring.proxy;

import org.junit.Test;

public class DynamicProxyTest {
    @Test
    public void dynamicProxyTest(){
        Calculator proxy = (Calculator) new ProxyFactory(new CalculatorImpl()).getProxy();
        proxy.div(1,2);
    }
}
