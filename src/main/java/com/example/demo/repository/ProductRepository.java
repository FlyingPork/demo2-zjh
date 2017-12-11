package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface ProductRepository {
    List<Product> findProductsByProductNameMatches(String str);

    List<Product> findProductsByType(String str);
}
