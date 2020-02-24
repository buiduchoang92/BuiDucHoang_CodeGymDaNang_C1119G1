package com.example.quanlitinh.service;

import com.example.quanlitinh.model.Customer;
import com.example.quanlitinh.model.Province;



public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
