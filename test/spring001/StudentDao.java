package spring001;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void selectAll() {
        System.out.println("我是dao层 查询");
    }

    public void insert() {
        System.out.println("我是dao层 增加");
    }

    public void delete() {
        System.out.println("我是dao层 删除");
    }

    public void change() {
        System.out.println("我是dao层 修改");
    }
}
