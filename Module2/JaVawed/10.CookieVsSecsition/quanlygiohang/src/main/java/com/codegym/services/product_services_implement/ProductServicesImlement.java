package com.codegym.services.product_services_implement;

import com.codegym.model.Product;
import com.codegym.reponsitory.ProductReponsitory;
import com.codegym.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServicesImlement implements ProductService {
    @Autowired
    ProductReponsitory productReponsitory;
    @Override
    public Iterable<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
       productReponsitory.save(product);
    }

    @Override
    public void remove(Product product) {
        productReponsitory.delete(product);
    }

    @Override
    public Product findByIdZ(Long id) {
        return productReponsitory.findByIdZ(id);
    }
}
