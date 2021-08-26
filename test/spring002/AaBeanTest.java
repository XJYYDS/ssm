package spring002;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AaBeanTest {
    @Test
    public void test01() {
        String xml = "spring002/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        AaBean aaBean = ac.getBean("AaBean", AaBean.class);
        System.out.println("aaBean = " + aaBean);
    }
}
