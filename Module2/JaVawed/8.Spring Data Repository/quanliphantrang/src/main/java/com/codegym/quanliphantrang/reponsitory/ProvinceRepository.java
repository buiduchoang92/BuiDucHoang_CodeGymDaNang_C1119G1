package com.codegym.quanliphantrang.reponsitory;

import com.codegym.quanliphantrang.model.Province;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
//    @Query("select c from Province d inner join Customer.province_id")
}
