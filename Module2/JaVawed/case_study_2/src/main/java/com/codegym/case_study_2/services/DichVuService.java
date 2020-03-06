package com.codegym.case_study_2.services;

import com.codegym.case_study_2.models.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DichVuService {
    Services findByIdL(Long id);

    Page<Services> findByName(String name, Pageable pageable);

    void save(Services services);

    void delete(Services services);

    Page<Services> findAll(Pageable pageable);

//    List<Services> findAllList(List<Services> servicesList);
}
