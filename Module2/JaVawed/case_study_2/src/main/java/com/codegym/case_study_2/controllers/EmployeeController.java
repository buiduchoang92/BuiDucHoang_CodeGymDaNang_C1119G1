package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.Customer;
import com.codegym.case_study_2.models.Employee;
import com.codegym.case_study_2.repositories.DegreeRepository;
import com.codegym.case_study_2.repositories.PartsRepository;
import com.codegym.case_study_2.repositories.PositionRepository;
import com.codegym.case_study_2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionRepository positionRepository;
    @Autowired
    PartsRepository partsRepository;
    @Autowired
    DegreeRepository degreeRepository;
    @GetMapping("/employees")
        public ModelAndView showNameEmployee(@ModelAttribute("s")Optional<String>s,Pageable pageable){
            Page<Employee> nameEmployee;
            if (s.isPresent()){
                nameEmployee = employeeService.findByName(s.get(),PageRequest.of(pageable.getPageNumber(),1));
            }else {
                nameEmployee = employeeService.findAll(PageRequest.of(pageable.getPageNumber(),5));
            }
            ModelAndView modelAndView = new ModelAndView("employee/list");
            modelAndView.addObject("employees",nameEmployee);
            return modelAndView;
        }
    @GetMapping("/create-employee")
        public ModelAndView showCreateEmployee(){
        ModelAndView mav = new ModelAndView("employee/create","employees",new Employee());
        mav.addObject("pos",positionRepository.findAll());
        mav.addObject("par",partsRepository.findAll());
        mav.addObject("deg",degreeRepository.findAll());
        return mav;
    }
    @PostMapping("/create-employee")
    public ModelAndView saveCustomer(@ModelAttribute("employees")Employee employee){

//        if (bindingResult.hasErrors()){
//            return new ModelAndView("employee/create");
//        }else {
            employeeService.save(employee);
            ModelAndView mav = new ModelAndView("employee/create");
            mav.addObject("success","create employee ok");
            mav.addObject("employees",new Employee());
            return mav;
//        }
    }

}
