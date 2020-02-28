package com.codegym.quanlikhachhangsudungrestful.service.serviceImpl;

import com.codegym.quanlikhachhangsudungrestful.model.Customer;
import com.codegym.quanlikhachhangsudungrestful.reponsitory.CustomerReponsitory;
import com.codegym.quanlikhachhangsudungrestful.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerReponsitory customerReponsitory;


    @Override
    public List<Customer> findAll() {
        return customerReponsitory.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerReponsitory.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerReponsitory.deleteById(id);
    }
}
