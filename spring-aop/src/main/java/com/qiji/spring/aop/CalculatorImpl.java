package com.qiji.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result=i+j;
        System.out.println("方法内部add方法：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result=i-j;
        System.out.println("方法内部sub方法：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result=i*j;
        System.out.println("方法内部mul方法：" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result=i/j;
        System.out.println("方法内部div方法：" + result);
        return result;
    }
}
