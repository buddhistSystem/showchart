package com.demo.showchart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.showchart")
public class ShowchartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowchartApplication.class, args);
    }

}
