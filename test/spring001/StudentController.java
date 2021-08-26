package spring001;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    public void selectAll() {
        studentService.selectAll();
    }

    public void insert() {
        studentService.insert();
    }

    public void delete() {
        studentService.delete();
    }

    public void change() {
        studentService.change();
    }
}

