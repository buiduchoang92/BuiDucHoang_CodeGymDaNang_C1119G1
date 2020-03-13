package com.codegym.service.implement;

import com.codegym.model.MatHang;
import com.codegym.reponsitory.MatHangReponsitory;
import com.codegym.service.MatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatHangServiceImplement implements MatHangService {
    @Autowired
    MatHangReponsitory matHangReponsitory;
    @Override
    public List<MatHang> findAll() {
        return matHangReponsitory.findAll();
    }

    @Override
    public MatHang findById(Long id) {
        return matHangReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(MatHang matHang) {
        matHangReponsitory.save(matHang);
    }

    @Override
    public void remove(MatHang matHang) {
        matHangReponsitory.delete(matHang);
    }

    @Override
    public MatHang findByIdZ(Long id) {
        return matHangReponsitory.findByIdZ(id);
    }

    @Override
    public List<MatHang> findByName(String name) {
        return matHangReponsitory.findByName(name);
    }
}
