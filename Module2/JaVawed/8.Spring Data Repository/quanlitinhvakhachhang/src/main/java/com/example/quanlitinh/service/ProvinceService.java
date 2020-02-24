package com.example.quanlitinh.service;

import com.example.quanlitinh.model.Province;

import java.util.Optional;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
