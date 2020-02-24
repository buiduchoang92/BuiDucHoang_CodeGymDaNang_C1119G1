package com.example.quanlitinh.reponsitory;

import com.example.quanlitinh.model.Customer;
import com.example.quanlitinh.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
