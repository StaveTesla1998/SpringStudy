package com.qiji.spring.aop;

public interface Calculator {
    /**
     * 加
     *
     * @param i
     * @param j
     * @return
     */
    int add(int i, int j);

    int sub(int i, int j);

    int mul(int i, int j);

    int div(int i, int j);
}
