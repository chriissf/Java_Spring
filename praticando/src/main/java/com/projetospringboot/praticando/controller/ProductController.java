package com.projetospringboot.praticando.controller;

import com.projetospringboot.praticando.entities.Department;
import com.projetospringboot.praticando.entities.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Products> getObjects(){

        Department d1 = new Department(1L,"Tech");
        Department d2 = new Department(2L,"Pet");

        Products p1=new Products(1L,"Macbook Pro",4000.0,d1);
        Products p2=new Products(2L,"Pc game Pro",5000.0,d1);
        Products p3=new Products(3L,"Macbook Pro",300.0,d2);

        List<Products> list = Arrays.asList(p1,p2,p3);
        return list;
    }
}
