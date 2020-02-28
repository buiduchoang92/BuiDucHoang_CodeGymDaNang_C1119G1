package com.codegym.controller;

import com.codegym.model.Giohang;
import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.services.product_services_implement.ProductServicesImlement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("giohang")
public class ProductController {
    @Autowired
    ProductService productService;

    @ModelAttribute("giohang")
    public Giohang setGioHang(){
        return new Giohang();
    }


    @GetMapping("/")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list", "products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/create-product")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }


    @PostMapping("/create-product")
    public ModelAndView saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New product created successfully");
        return modelAndView;
    }
    @GetMapping("/edit-product/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Product product = productService.findById(id);
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("product", product);
            return modelAndView;

    }
    @PostMapping("/edit-product")
    public ModelAndView editProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New product created successfully");
        return modelAndView;
    }
    @GetMapping("/delete-product/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("product", product);
        return modelAndView;
    }
    @PostMapping("/delete-product")
    public String deleteProduct(@ModelAttribute("product")Product product){
        productService.remove(product);
       return "redirect:/";
    }
    @GetMapping("/view-product/{id}")
    public String showForm(@PathVariable Long id,Model model){
        Product product = productService.findByIdZ(id);
        model.addAttribute("product",product);
        return "view";
    }
    @PostMapping("/product-giohang")
    public String get(@ModelAttribute("giohang")Giohang giohang,@RequestParam("id") Long id, Model model, RedirectAttributes redirect){
    Product product = productService.findByIdZ(id);
        giohang.add(product);
    model.addAttribute("giohang",giohang);
    redirect.addFlashAttribute("success","Add product to Gio Hang success");
    return "show-giohang";
    }
    @GetMapping("/delete-giohang/{id}")
    public String deleteGiahang(@PathVariable Long id,RedirectAttributes redirectAttributes,Giohang giohang){
        giohang.remove(id);
        redirectAttributes.addFlashAttribute("success","delete gio hang success");
        return "redirect:/";
    }

}