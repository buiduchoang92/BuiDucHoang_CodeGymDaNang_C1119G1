package com.codegym.case_study_2.services.implement;

import com.codegym.case_study_2.models.Contact;
import com.codegym.case_study_2.repositories.ContactReponsitory;
import com.codegym.case_study_2.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ContactServiceImp implements ContactService {
    @Autowired
    ContactReponsitory contactReponsitory;

    @Override
    public Optional<Contact> findById(Long id) {
        return contactReponsitory.findById(id);
    }

    @Override
    public void delete(Long id) {
        contactReponsitory.deleteById(id);
    }

    @Override
    public void save(Contact contact) {
        contactReponsitory.save(contact);
    }

    @Override
    public Contact findByIdL(Long id) {
        return contactReponsitory.findByIdL(id);
    }

    @Override
    public Page<Contact> findAll(Pageable pageable) {
        return contactReponsitory.findAll(pageable);
    }

    @Override
    public Page<Contact> findByName(String name, Pageable pageable) {
        return contactReponsitory.findByName(name,pageable);
    }
}
