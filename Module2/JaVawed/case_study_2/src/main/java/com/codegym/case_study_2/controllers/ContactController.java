package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.Contact;
import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.models.Employee;
import com.codegym.case_study_2.repositories.CustomerReponsitory;
import com.codegym.case_study_2.repositories.EmployeeRepository;
import com.codegym.case_study_2.repositories.ServiceReponsitory;
import com.codegym.case_study_2.services.ContactService;
import com.codegym.case_study_2.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@Controller
@SessionAttributes("contact")
public class ContactController {
    @Autowired
    ContactService contactService;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CustomerReponsitory customerReponsitory;
    @Autowired
    ServiceReponsitory serviceReponsitory;
    @Autowired
    CustomerService customerService;

    @GetMapping("/contacts")
    public ModelAndView showContact(@ModelAttribute("s") Optional<String> s, Pageable pageable,
                                    @CookieValue(value = "setContact",defaultValue = "")String c,
                                    HttpServletRequest request) {
        Page<Contact> nameContact;
        if (s.isPresent()) {
            nameContact = contactService.findByName(s.get(), PageRequest.of(pageable.getPageNumber(), 1));
        } else {
            nameContact = contactService.findAll(PageRequest.of(pageable.getPageNumber(), 5));
        }
        ModelAndView mav = new ModelAndView("contact/list");

        mav.addObject("contacts", nameContact);
        mav.addObject("setContact",c);
//        Cookie cookies[]=request.getCookies();
//        for (Cookie cookie:cookies){
//            if(cookie.getName().equals("setContact")){
////                mav.addObject("setContact",cookie.getValue().split("#"));
//                mav.addObject("setContact",cookie.getValue());
//            }
//        }
        return mav;
    }

    @GetMapping("/create-contact")
    public ModelAndView showCreateContact() {
        ModelAndView mav = new ModelAndView("contact/create", "contacts", new Contact());
        mav.addObject("em", employeeRepository.findAll());
        mav.addObject("cus", customerReponsitory.findAll());
        mav.addObject("ser", serviceReponsitory.findAll());
        return mav;
    }

    @PostMapping("/create-contact")
    public String saveCreate(@ModelAttribute("contacts") Contact contact, Model model,
                             @CookieValue(value = "setContact", defaultValue = "") String setContact
            , HttpServletResponse response,HttpServletRequest request) {
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        Cookie cookie = new Cookie("setContact",setContact + "#" + date.toString());
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);
        Cookie cookie1[] = request.getCookies();
        for (Cookie c: cookie1) {
            if (c.getValue().equals("setContact")){
                model.addAttribute("success","contact success");
                model.addAttribute("cookieValue",c.getValue());
            }
        }
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/view-customer-contact")
    public ModelAndView viewContactAndCustomer(Pageable pageable) {
        return new ModelAndView("customer/list", "customers",
                customerService.findCustomerByContactList(pageable));
    }
}
