package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.ContactDetails;
import com.codegym.case_study_2.repositories.AccompanyingServiceRepository;
import com.codegym.case_study_2.repositories.ContactReponsitory;
import com.codegym.case_study_2.services.ContactDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactDetailController {
    @Autowired
    ContactDetailService contactDetailService;
    @Autowired
    ContactReponsitory contactReponsitory;
    @Autowired
    AccompanyingServiceRepository accompanyingServiceRepository;
    @GetMapping("/contactdetails")
    public ModelAndView showContactDetail(Pageable pageable){
        return new ModelAndView("contactDetail/list","contactdetails",contactDetailService.findAll(pageable));
    }
    @GetMapping("/create-contactdetail")
    public ModelAndView showCreateContactDetail(){
        ModelAndView mav = new ModelAndView("contactDetail/create");
        mav.addObject("con",contactReponsitory.findAll());
        mav.addObject("acc",accompanyingServiceRepository.findAll());
        mav.addObject("contactdetails",new ContactDetails());
        return mav;
    }
    @PostMapping("create-contactdetail")
    public ModelAndView saveCreateContactDetail(@ModelAttribute("contactdetails") ContactDetails contactDetails){
        contactDetailService.save(contactDetails);
        ModelAndView mav = new ModelAndView("contactDetail/create");
        mav.addObject("success","contactDetail add ok");
        mav.addObject("contactdetails",contactDetails);
        return mav;
    }
}
