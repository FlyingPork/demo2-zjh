package com.example.demo.repository;

import com.example.demo.domain.ProductAdvertisement;

import java.util.List;

public interface ProductAdvertisementRepository {
    List<ProductAdvertisement> findByPlace(int place);

}
