package com.qiji.spring.proxy;

public class CalculatorStaticProxy implements Calculator{
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("代理模式处理前");
        int add = calculator.add(i, j);
        System.out.println("代理模式处理后");
        return add;
    }

    @Override
    public int sub(int i, int j) {
        int sub = calculator.sub(i, j);
        return sub;
    }

    @Override
    public int mul(int i, int j) {
        int mul = calculator.mul(i, j);
        return mul;
    }

    @Override
    public int div(int i, int j) {
        int div = calculator.div(i, j);
        return div;
    }
}
