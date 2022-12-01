import com.qiji.pojo.Clazz;
import com.qiji.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
