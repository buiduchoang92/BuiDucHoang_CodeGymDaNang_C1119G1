package com.codegym.services;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void remove(Product product);

    Product findByIdZ(Long id);


}
