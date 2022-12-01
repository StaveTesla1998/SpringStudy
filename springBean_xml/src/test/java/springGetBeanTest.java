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
}
