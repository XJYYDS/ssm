package spring002;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AaBean {
    @Value("#{prop.name}")
    private String name;
    @Value("20")
    private int age;

    @Override
    public String toString() {
        return "AaBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
