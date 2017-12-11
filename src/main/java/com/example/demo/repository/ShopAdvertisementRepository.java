package com.example.demo.repository;


import com.example.demo.domain.ShopAdvertisement;
import  java.util.*;

//@Repository extends JpaRepository<ShopAdvertisement,Long>
public interface ShopAdvertisementRepository {
    //List<ShopAdvertisement> findAll();
    List<ShopAdvertisement> findAllads();
    //long findAdvertisementBy
}
