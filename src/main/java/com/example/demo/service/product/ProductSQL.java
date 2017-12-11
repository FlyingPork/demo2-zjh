package com.example.demo.service.product;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

/*
* Test类
*
* */

public class ProductSQL implements ProductRepository {

    private int number = 5;
    private Product[] product = new Product[number];
    public ProductSQL(){//假数据
        product[0] = new Product(1000,"iphone", "",500,"CellPhones");
        product[1] = new Product(1001,"ps4", "",500,"Home");
        product[2] = new Product(1002,"office365", "",500,"Office");
        product[3] = new Product(1003,"Lenovo", "",600,"Computers");
        product[4] = new Product(1004,"sharpTV","",1400,"TV");
    }

    public List<Product> findProductsByProductNameMatches(String str){
        if(str == null) return null;
        List<Product> products = new ArrayList<>();
        for(Product p : product) {
            if(p != null){
                if(str.equals(p.getProductName())){
                    products.add(p);
                }
            }
        }
        return products;
    }

    public List<Product> findProductsByType(String str){
        if(str == null) return null;
        List<Product> products = new ArrayList<>();
        for(Product p : product) {
            if(p != null) {
                if (str.equals(p.getType())) {
                    products.add(p);
                }
            }
        }
        return products;
    }

    public Product findProductbyProductID(int id) {

        for(Product p : product) {
            if(p != null) {
                if (id == p.getProductId()) {
                    return p;
                }
            }
        }
        return null;
    }
}
