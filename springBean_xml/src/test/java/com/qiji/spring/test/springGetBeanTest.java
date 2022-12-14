package com.qiji.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.qiji.pojo.Clazz;
import com.qiji.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class springGetBeanTest {
    @Test
    public void springGetBeanByXmlTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentBen = (Student) ac.getBean("StudentBen");
        studentBen.seyHello();
        System.out.println(studentBen);
    }

    /**
     * spring DI 的setter注入测试
     */
    @Test
    public void springBeanDITest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st1 = ac.getBean("StudentBean1", Student.class);
        System.out.println(st1);
    }

    /**
     * 构造器注入
     */
    @Test
    public void springBeanConstructTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st2 = ac.getBean("studentBean2", Student.class);
        System.out.println(st2);
    }

    @Test
    public void springBeanSetValueByClassTest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st3 = ca.getBean("studentBean3", Student.class);
        System.out.println(st3);
    }

    @Test
    public void springBeanSetValueByJilianTest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st4 = ca.getBean("studentBean4", Student.class);
        System.out.println(st4);
    }

    @Test
    public void springBeanSetValueByInsideBeanTest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st5 = ca.getBean("studentBean5", Student.class);
        System.out.println(st5);
    }

    /**
     * springBean为数组类型的属性赋值
     */
    @Test
    public void springBeanSetValueToArraryTypeTest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st6 = ca.getBean("studentBean6", Student.class);
        System.out.println(st6);
    }

    /**
     * 为集合类型的属性赋值
     */
    @Test
    public void springBeanSetValueToListTypeTest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz cl4 = ca.getBean("clazzBean4", Clazz.class);
        System.out.println(cl4);
    }
    @Test
    public void springBeanSetValueToListType2Test(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz cl5 = ca.getBean("clazzBean5", Clazz.class);
        System.out.println(cl5);
    }

    /**
     * 为Map类型的属性赋值
     */
    @Test
    public void springBeanSetValueToMapTypeTest(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st7 = ca.getBean("studentBean7", Student.class);
        System.out.println(st7);
    }

    @Test
    public void springBeanSetValueToMapType2Test(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st8 = ca.getBean("studentBean8", Student.class);
        System.out.println(st8);
    }

    /**
     * spring管理第三方Bean-duridDatasource
     */
    @Test
    public void springManageDuridDatasourceTest() throws SQLException {
        DruidDataSource druidDatasourceBean = new ClassPathXmlApplicationContext("spring-datasource.xml").getBean("druidDatasourceBean", DruidDataSource.class);
        System.out.println(druidDatasourceBean.getConnection());
    }

    @Test
    public void springManageDuridDatasourceTest1() throws SQLException {
        DruidDataSource druidDatasourceBean = new ClassPathXmlApplicationContext("spring-datasource.xml").getBean("druidDatasourceBean1", DruidDataSource.class);
        System.out.println(druidDatasourceBean.getConnection());
    }
}
