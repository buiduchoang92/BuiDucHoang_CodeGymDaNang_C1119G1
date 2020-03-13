package com.codegym.reponsitory;

import com.codegym.model.MatHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MatHangReponsitory extends JpaRepository<MatHang,Long> {
    @Query("select c from MatHang c where c.id=?1")
    MatHang findByIdZ(Long id);
    @Query("select c from MatHang c where c.tenHang like  ?1%")
    List<MatHang> findByName(String name);

}
