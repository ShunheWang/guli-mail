package com.maison.gulimail.product;

import com.maison.gulimail.product.entity.BrandEntity;
import com.maison.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;


@SpringBootTest
class GulimailProdApplicationTests {

    @Autowired
    public BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("shunhe");
        System.out.println(brandService.save(brandEntity));
    }

}
