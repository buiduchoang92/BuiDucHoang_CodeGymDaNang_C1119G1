package com.codegym.sevices;

import com.codegym.model.Product;

import java.util.List;

public interface ProductSevices {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);

}
