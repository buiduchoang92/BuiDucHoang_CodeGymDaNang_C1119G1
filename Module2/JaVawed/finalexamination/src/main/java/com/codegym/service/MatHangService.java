package com.codegym.service;

import com.codegym.model.MatHang;

import java.util.List;

public interface MatHangService {
    List<MatHang> findAll();

    MatHang findById(Long id);

    void save(MatHang matHang);

    void remove(MatHang matHang);

    MatHang findByIdZ(Long id);

    List<MatHang> findByName(String name);
}
