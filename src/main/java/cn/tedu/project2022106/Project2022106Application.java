package cn.tedu.project2022106;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.project2022106.mapper")
public class Project2022106Application {

    public static void main(String[] args) {
        SpringApplication.run(Project2022106Application.class, args);
    }

}
