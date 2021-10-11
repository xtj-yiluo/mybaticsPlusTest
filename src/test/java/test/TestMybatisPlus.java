package test;

import cn.mybatisPlus.test.TestMybatisPlusApplication;
import cn.mybatisPlus.test.entity.Demo;
import cn.mybatisPlus.test.mapper.DemoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestMybatisPlusApplication.class)
public class TestMybatisPlus {

    @Autowired
    private DemoMapper demoMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));

        List<Demo> demoList = demoMapper.selectList(null);
        for(Demo demoMapper:demoList) {
            System.out.println(demoMapper);
        }
    }

    @Test
    public void testInsert() {
        System.out.println(("----- selectAll method test ------"));
        Demo demo = new Demo();

        demo.setFirst(4);
        demo.setSecond("crdfg");
        demo.setThird(new Date());
        demoMapper.insert(demo);
    }

    @Test
    public void testBooleanId() {
        System.out.println(("----- selectAll method test ------"));
        List a = new ArrayList();
        boolean flag= a.add(1);
        System.out.println(flag);

    }
}
