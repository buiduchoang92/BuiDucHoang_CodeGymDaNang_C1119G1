package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.ContactDetails;
import com.codegym.case_study_2.repositories.ContactDetailRepository;
import com.codegym.case_study_2.services.ContactDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactDetailServiceImp implements ContactDetailService {
    @Autowired
    ContactDetailRepository contactDetailRepository;


    @Override
    public Optional<ContactDetails> findById(Long id) {
        return contactDetailRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        contactDetailRepository.deleteById(id);
    }

    @Override
    public void save(ContactDetails details) {
        contactDetailRepository.save(details);
    }

    @Override
    public ContactDetails findByIdL(Long id) {
        return contactDetailRepository.findByIdL(id);
    }

    @Override
    public Page<ContactDetails> findAll(Pageable pageable) {
        return contactDetailRepository.findAll(pageable);
    }

    @Override
    public Page<ContactDetails> findByName(String name, Pageable pageable) {
        return contactDetailRepository.findByName(name,pageable);
    }
}
