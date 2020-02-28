package com.duchoang.demo.controller;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import com.duchoang.demo.service.Blogsevice;
import com.duchoang.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService  categoryService;
    @Autowired
    private Blogsevice blogsevice;
    @GetMapping("/category")
    public ResponseEntity<List<Category>> listAllBlog() {
        List<Category> categoryList = categoryService.findAll();

        if (categoryList.isEmpty()){
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Category>>(categoryList,HttpStatus.OK);
    }

    /*@RequestMapping(value = "/category/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Blog>> getCustomer(@PathVariable("id") long id,Blog blog) {
        *//*System.out.println("Fetching Customer with id " + id);
        Category category = categoryService.findById(id);*//*

        *//*if (category == null) {
            System.out.println("Customer with id " + id + " not found");
            return new ResponseEntity<List<Blog>>(HttpStatus.NOT_FOUND);
        }*//*
        return new ResponseEntity<List<Blog>>(, HttpStatus.OK);
    }*/

//    @GetMapping("/category")
//    public ModelAndView showCategoryFom(){
//        Iterable<Category> category = categoryService.findAll();
//        ModelAndView modelAndView = new ModelAndView("category/list");
//        modelAndView.addObject("category",category);
//        return modelAndView;
//    }
//    @GetMapping("/create-category")
//    public ModelAndView showCategorycreate(){
//        ModelAndView modelAndView = new ModelAndView("category/create");
//        modelAndView.addObject("category",new Category());
//        return modelAndView;
//    }
//    @PostMapping("create-category")
//    public ModelAndView createCategory(@ModelAttribute("category") Category category){
//        categoryService.save(category);
//        ModelAndView modelAndView = new ModelAndView("category/create");
//        modelAndView.addObject("category",category);
//        return modelAndView;
//    }
//    @GetMapping("/edit-category/{id}")
//    public ModelAndView showCategoryeidt(@PathVariable Long id){
//        Category category = categoryService.findById(id);
//        ModelAndView modelAndView = new ModelAndView("category/edit");
//        modelAndView.addObject("category",category);
//        return modelAndView;
//    }
//    @PostMapping("edit-category")
//    public ModelAndView eidtCategory(@ModelAttribute("category") Category category){
//        categoryService.save(category);
//        ModelAndView modelAndView = new ModelAndView("category/list");
//        modelAndView.addObject("category",category);
//        return modelAndView;
//    }
//    @GetMapping("/delete-category/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Long id){
//        Category category = categoryService.findById(id);
//            ModelAndView modelAndView = new ModelAndView("category/delete");
//            modelAndView.addObject("category", category);
//            return modelAndView;
//
//    }
//
//    @PostMapping("/delete-category")
//    public String deleteProvince(@ModelAttribute("category") Category category){
//        categoryService.remove(category);
//        return "redirect:category";
//    }

}
