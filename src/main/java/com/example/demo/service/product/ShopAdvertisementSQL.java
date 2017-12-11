package com.example.demo.service.product;

/*
 * Test类
 *
 * */

import com.example.demo.domain.ShopAdvertisement;
import com.example.demo.repository.ShopAdvertisementRepository;

import java.util.ArrayList;
import java.util.List;

public class ShopAdvertisementSQL implements ShopAdvertisementRepository {
    private int number = 5;
    public ShopAdvertisement[] shopadvertisement = new ShopAdvertisement[number];
    public ShopAdvertisementSQL(){//假数据
        shopadvertisement[0] = new ShopAdvertisement(100,1001,"shoes shop");
        shopadvertisement[1] = new ShopAdvertisement(101,1002,"shirt shop");
        shopadvertisement[2] = new ShopAdvertisement(102,1003,"pants shop");
        shopadvertisement[3] = new ShopAdvertisement(103,1004,"finger shop");
        shopadvertisement[4] = new ShopAdvertisement(104,1005,"phone shop");


    }
    public List<ShopAdvertisement> findAllads(){
        List<ShopAdvertisement> shopAdvertisements = new ArrayList<>();
        for(int i = 0; i < number; i++){
            shopAdvertisements.add(shopadvertisement[i]);
        }
        return shopAdvertisements;
    }

}
