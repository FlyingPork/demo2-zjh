package com.example.demo.service.product;

import com.example.demo.domain.ProductAdvertisement;
import com.example.demo.repository.ProductAdvertisementRepository;

import java.util.ArrayList;
import java.util.List;

/*
 * Test类
 *
 * */
public class ProductAdvertisementSQL implements ProductAdvertisementRepository {
    private int number = 5;
    private ProductAdvertisement[] productadv = new ProductAdvertisement[number];
    public ProductAdvertisementSQL(){//假数据
        productadv[0] = new ProductAdvertisement(100,1000,1.99,1,"shoes");
        productadv[1] = new ProductAdvertisement(101,1001,199.7,2,"tshirt");
        productadv[2] = new ProductAdvertisement(102,1002,200,1,"phone");
        productadv[3] = new ProductAdvertisement(103,1003,14,2,"book");
        productadv[4] = new ProductAdvertisement(104,1004,144,2,"light");


    }


    public List<ProductAdvertisement> findByPlace(int place){
        List<ProductAdvertisement> pro = new ArrayList<>();
        for(int i = 0; i < number; i++){
            if(place == productadv[i].getPlace()){
                pro.add(productadv[i]);
            }
        }
        return  pro;
    }
}
