package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.Services;
import com.codegym.case_study_2.repositories.ServiceReponsitory;
import com.codegym.case_study_2.services.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuServiceIpml implements DichVuService {
    @Autowired
    ServiceReponsitory serviceReponsitory;

    @Override
    public Services findByIdL(Long id) {
        return serviceReponsitory.findByIdL(id);
    }

    @Override
    public Page<Services> findByName(String name, Pageable pageable) {
        return serviceReponsitory.findByName(name,pageable);
    }

    @Override
    public void save(Services services) {
        serviceReponsitory.save(services);
    }

    @Override
    public void delete(Services services) {
        serviceReponsitory.delete(services);
    }

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return serviceReponsitory.findAll(pageable);
    }

//    @Override
//    public List<Services> findAllList(List<Services> servicesList) {
//        return findAllList(servicesList);
//    }
}
