package com.maison.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.maison.gulimail.product.dao")
@SpringBootApplication
public class GulimailProdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProdApplication.class, args);
    }

}
