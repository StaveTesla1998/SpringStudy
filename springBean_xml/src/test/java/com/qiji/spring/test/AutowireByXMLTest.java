package com.qiji.spring.test;

import com.qiji.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByXMLTest {
    /**
     * 没有使用自动装配，通过配置文件手动为属性赋值
     */
    @Test
    public void userControllerAutowireByXMLTest1(){
        ApplicationContext cl = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = (UserController) cl.getBean("userController");
        userController.saveUser();
    }

    /**
     * 使用自动装配，按类型自动装配
     */
    @Test
    public void userControllerAutowireByXMLTest2(){
        ApplicationContext cl = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = (UserController) cl.getBean("userController");
        userController.saveUser();
    }

    /**
     * 使用自动装配，按名称自动装配
     */
    @Test
    public void userControllerAutowireByXMLTest3(){
        ApplicationContext cl = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = (UserController) cl.getBean("userController");
        userController.saveUser();
    }
}
