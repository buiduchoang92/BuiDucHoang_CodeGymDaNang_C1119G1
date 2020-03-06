package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerReponsitory extends PagingAndSortingRepository<Customer,Long> {

    @Query("select c from Customer c WHERE c.idCustomer =?1")
    Customer findByIdL(Long id);

    Page<Customer> findAll(Pageable pageable);

    @Query("select c from Customer c where c.nameCustomer like  ?1%")
    Page<Customer> findByName(String name, Pageable pageable);

    @Query("select c from Customer c inner join Contact con on c.idCustomer=con.customer.idCustomer")
    Page<Customer> findCustomerByContactList(Pageable pageable);
}
