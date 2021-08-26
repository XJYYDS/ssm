package spring001;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01() {
        String xml = "spring001/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentController studentController = ac.getBean("studentController", StudentController.class);
        studentController.selectAll();
        studentController.insert();
        studentController.delete();
        studentController.change();
    }
}
