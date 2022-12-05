package com.qiji.spring;

import com.qiji.spring.controller.UserController;
import com.qiji.spring.dao.UserDao;
import com.qiji.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCByAnnotation {
    @Test
    public void annotationGetBeanTest(){
        ApplicationContext cl = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
//        UserService userServiceImpl = (UserService) cl.getBean();
        UserDao userDaoImpl = (UserDao) cl.getBean("userDaoImpl");
        UserController userController = cl.getBean(UserController.class);

        System.out.println(userController);
//        System.out.println(userServiceImpl);
        System.out.println(userDaoImpl);
    }
}
