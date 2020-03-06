package com.codegym.case_study_2.controllers;

import com.codegym.case_study_2.models.Services;
import com.codegym.case_study_2.models.TypeOfService;
import com.codegym.case_study_2.repositories.ServiceReponsitory;
import com.codegym.case_study_2.repositories.TypeOfRentRepository;
import com.codegym.case_study_2.repositories.TypeOfServiceRepository;
import com.codegym.case_study_2.services.DichVuService;
import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("likesv")
public class ServiceController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    TypeOfServiceRepository typeOfServiceRepository;
    @Autowired
    TypeOfRentRepository typeOfRentRepository;
    @GetMapping("/services")
    private ModelAndView findAllServices(Pageable pageable){
    Page<Services> service = dichVuService.findAll(PageRequest.of(pageable.getPageNumber(),2));
        return new ModelAndView("service/list", "services", service);
    }
    @GetMapping("/create-service")
    private ModelAndView showcreateService(){
        ModelAndView mav=new  ModelAndView("service/create","services",new Services());
        mav.addObject("type",typeOfServiceRepository.findAll());
        mav.addObject("rent",typeOfRentRepository.findAll());
        return mav;
    }
    @PostMapping("/create-service")
    private ModelAndView savecreateService(@ModelAttribute("services") Services services ){
            dichVuService.save(services);
            ModelAndView modelAndView = new ModelAndView("service/create");
            modelAndView.addObject("success","create service add ok");
            modelAndView.addObject("services",services);
            return modelAndView;
    }
    @GetMapping("/edit-service/{id}")
    private ModelAndView showEditService(@PathVariable Long id){
        Services services = dichVuService.findByIdL(id);
        ModelAndView modelAndView = new ModelAndView("service/edit","services",services);
        modelAndView.addObject("type",typeOfServiceRepository.findAll());
        modelAndView.addObject("rent",typeOfServiceRepository.findAll());
        return modelAndView;
    }
    @PostMapping("/edit-service")
    private ModelAndView saveEditService(@ModelAttribute("services")Services services){
        dichVuService.save(services);
        return new ModelAndView("service/edit","services",services);
    }
    @GetMapping("/delete-service/{id}")
    private String deleteService(@PathVariable Long id){
        Services services = dichVuService.findByIdL(id);
        dichVuService.delete(services);
        return "redirect:/services";
    }
    @ModelAttribute("likesv")
    public List<Services> servicesList(){
        return new ArrayList<>();
    }
    @GetMapping("/like-service/{id}")
    public ModelAndView likeService(@ModelAttribute(name = "likesv")List<Services> servicesList, @PathVariable Long id){
        Services services = dichVuService.findByIdL(id);
        servicesList.add(services);
        ModelAndView mav = new ModelAndView("service/show-like");
        mav.addObject("like",servicesList);
        return mav;
    }
//    @GetMapping("/like-service")
//        public String showLikeService(@ModelAttribute(name = "likesv")List<Services> servicesList,Model model){
//        model.addAttribute("like",dichVuService.findAllList(servicesList));
//            return "redirect:/show-like";
//    }
}
