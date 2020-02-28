package com.codegym.case_study_2.repositories;


import com.codegym.case_study_2.models.Contact;
import com.codegym.case_study_2.models.ContactDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailRepository extends JpaRepository<ContactDetails,Long> {
    @Query("select c from Contact c WHERE c.idContact =?1")
    ContactDetails findByIdL(Long id);

    Page<ContactDetails> findAll(Pageable pageable);

    @Query("select c from Contact c where c.nameContact like  ?1%")
    Page<ContactDetails> findByName(String name, Pageable pageable);
}
