package spring001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void selectAll() {
        studentDao.selectAll();
    }

    @Override
    public void insert() {
        studentDao.insert();
    }

    @Override
    public void delete() {
        studentDao.delete();
    }

    @Override
    public void change() {
        studentDao.change();
    }
}
