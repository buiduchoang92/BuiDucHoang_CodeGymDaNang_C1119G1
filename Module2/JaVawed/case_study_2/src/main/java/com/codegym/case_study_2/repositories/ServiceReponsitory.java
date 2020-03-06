package com.codegym.case_study_2.repositories;



import com.codegym.case_study_2.models.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceReponsitory extends PagingAndSortingRepository<Services,Long> {
    @Query("select c from Services c where c.idService=?1")
    Services findByIdL(Long id);

    @Query("select c from Services c where c.nameService like ?1%")
    Page<Services> findByName(String name, Pageable pageable);

    Page<Services> findAll(Pageable pageable);

//    List<Services> findAllList(List<Services> servicesList);
}
