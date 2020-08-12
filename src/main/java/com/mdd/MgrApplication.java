package com.mdd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.mdd.mapper")
@SpringBootApplication
public class MgrApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgrApplication.class, args);
    }

}
