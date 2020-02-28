package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.repositories.CustomerReponsitory;
import com.codegym.case_study_2.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerReponsitory customerReponsitory;


    @Override
    public Customer findById(Long id) {
//        return Optional.empty();
        return customerReponsitory.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        customerReponsitory.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        customerReponsitory.save(customer);
    }

    @Override
    public Customer findByIdL(Long id) {
        return customerReponsitory.findByIdL(id);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerReponsitory.findAll(pageable);
    }

    @Override
    public Page<Customer> findByName(String name, Pageable pageable) {
        return customerReponsitory.findByName(name,pageable);
    }
}
