package cn.mybatisPlus.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.mybatisPlus.test.mapper")
@SpringBootApplication
public class TestMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMybatisPlusApplication.class, args);
    }

}
