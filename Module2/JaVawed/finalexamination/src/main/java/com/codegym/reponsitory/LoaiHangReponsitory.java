package com.codegym.reponsitory;

import com.codegym.model.LoaiHang;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LoaiHangReponsitory extends PagingAndSortingRepository<LoaiHang ,Long> {
}
