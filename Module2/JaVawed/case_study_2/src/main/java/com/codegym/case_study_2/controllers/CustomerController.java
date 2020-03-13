package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.repositories.TypeOfCustomerRepository;
import com.codegym.case_study_2.repositories.TypeOfServiceRepository;
import com.codegym.case_study_2.services.CustomerService;
import com.codegym.case_study_2.validation.CustomerValidatetion;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    TypeOfCustomerRepository typeOfCustomerRepository;

    @GetMapping("/customers")
    public ModelAndView showNameCustomer(@ModelAttribute(name = "s")Optional<String> s,Pageable pageable){
        Page<Customer> nameCustomer;
        if (s.isPresent()){
            nameCustomer = customerService.findByName(s.get(),PageRequest.of(pageable.getPageNumber(),1));
        }else {
            nameCustomer = customerService.findAll(PageRequest.of(pageable.getPageNumber(),5));
        }
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers",nameCustomer);
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateCustomer() {
        Customer customer = new Customer();
        ModelAndView mav = new ModelAndView("customer/create");
        mav.addObject("customers",customer);
        mav.addObject("type",typeOfCustomerRepository.findAll());
        return mav;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCreateCustomer(@Validated @ModelAttribute("customers") Customer customer, BindingResult bindingResult) {
        new CustomerValidatetion().validate(customer,bindingResult);
        if (bindingResult.hasErrors()) { ModelAndView modelAndView = new ModelAndView("customer/create");
            return modelAndView;
        }else {
            customerService.save(customer);
            return new ModelAndView("customer/create","customers",new Customer());
        }

    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditCustomer(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customers", customer);
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public ModelAndView saveEditCustomer(@ModelAttribute("customers") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("success", "Edit customer add ok");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public String showDeleteCustomer(@PathVariable Long id) {
       customerService.delete(id);
        return "redirect:/customers";
    }


}
