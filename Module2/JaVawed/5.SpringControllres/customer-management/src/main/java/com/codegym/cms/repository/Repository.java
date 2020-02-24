package com.codegym.cms.repository;


import com.codegym.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Customer,Integer> {
}