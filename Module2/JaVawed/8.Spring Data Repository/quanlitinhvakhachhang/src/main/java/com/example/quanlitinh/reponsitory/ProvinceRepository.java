package com.example.quanlitinh.reponsitory;

import com.example.quanlitinh.model.Province;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
//    @Query("select c from Province d inner join Customer.province_id")
}
