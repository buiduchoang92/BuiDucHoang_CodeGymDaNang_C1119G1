package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.services.CustomerService;
import com.codegym.case_study_2.validation.CustomerValidatetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView listCustomer(Pageable pageable) {

        Page<Customer> customers = customerService.findAll(PageRequest.of(pageable.getPageNumber(),5));
        return new ModelAndView("customer/list", "customers", customers);
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateCustomer() {
        Customer customer = new Customer();
        return new ModelAndView("customer/create", "customers",customer);
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCreateCustomer(@Validated @ModelAttribute("customers") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) { ModelAndView modelAndView = new ModelAndView("customer/create");
        System.out.println("customer"+ customer);
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
    public ModelAndView showDeleteCustomer(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/delete");
        modelAndView.addObject("customers", customer);
        return modelAndView;
    }

    @PostMapping("/delete-customer")
    public String deleteEditCustomer(@ModelAttribute("customers") Customer customer) {
        customerService.delete(customer.getIdCustomer());
        return "redirect:/customer/list";
    }
}
