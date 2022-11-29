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
}
