package com.example.demo.service;


import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Service
public class ProductService {
    //@Resource
    private ProductRepository productRepository;
    //通过商品名查询商品
    public List<Product> getProductByName(String str){
        return productRepository.findProductsByProductNameMatches(str);
    }

    public  List<Product> getProductByType(String str){
        return productRepository.findProductsByType(str);
    }
}
