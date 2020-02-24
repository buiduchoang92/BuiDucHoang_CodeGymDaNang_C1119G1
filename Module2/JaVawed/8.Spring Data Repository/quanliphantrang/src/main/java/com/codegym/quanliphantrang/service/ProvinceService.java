package com.codegym.quanliphantrang.service;

import com.codegym.quanliphantrang.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
