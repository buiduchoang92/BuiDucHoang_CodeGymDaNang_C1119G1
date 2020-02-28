package com.duchoang.demo.controller;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import com.duchoang.demo.service.Blogsevice;
import com.duchoang.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {
    @Autowired
    private Blogsevice blogsevice;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("category")
    public Iterable<Category> provinces() {
        return categoryService.findAll();
    }

    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> lsitAllBlog() {
        List<Blog> blogs = blogsevice.findAll();
        System.out.println("blog la" + blogs);
        if (blogs.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogs,HttpStatus.OK);
    }


    @GetMapping("/blog-category/{id}")
    public ResponseEntity<List<Blog>> handleFindByCategory(@PathVariable Long id){
        Category category=categoryService.findById(id);
        return new ResponseEntity<>(blogsevice.findAllByCategory(category),HttpStatus.OK);
    }


    @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getCustomer(@PathVariable("id") long id) {
        System.out.println("Fetching Customer with id " + id);
        Blog blog = blogsevice.findById(id);
        if (blog == null) {
            System.out.println("Customer with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }


//    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Blog>> lsitAllBlog(@PathVariable("id")long id) {
//        Category category = categoryService.findById(id);
//    }

//    @GetMapping("/create-blog")
//    public ModelAndView createBlog() {
//        return new ModelAndView("blog/create", "blog", new Blog());
//    }
//
//    @PostMapping("/create-blog")
//    public ModelAndView saveBlog(@ModelAttribute(name = "blog") Blog blog, @RequestParam(name = "category")long categoryId) {
//        Category category = categoryService.findById(categoryId);
//        blog.setCategory(category);
//        blogsevice.save(blog);
//        ModelAndView modelAndView = new ModelAndView("blog/create");
//        modelAndView.addObject("blog", blog);
//        modelAndView.addObject("message", "Customer updated successfully");
//        return modelAndView;
//    }
//
//    @GetMapping("/edit-blog/{id}")
//    public ModelAndView editBlog(@PathVariable Long id) {
//        Blog blog = blogsevice.findById(id);
//        ModelAndView modelAndView = new ModelAndView("blog/edit", "blog", blog);
//        return modelAndView;
//    }
//
//    @PostMapping("/edit-blog")
//    public ModelAndView editBlog(@ModelAttribute(name = "blog") Blog blog) {
//        blogsevice.save(blog);
//        ModelAndView modelAndView = new ModelAndView("blog/edit");
//        modelAndView.addObject("blog", blog);
//        modelAndView.addObject("message", "Customer updated successfully");
//        return modelAndView;
//    }
//
//    @GetMapping("/delete-blog/{id}")
//    public ModelAndView deleteBlog(@PathVariable Long id) {
//        Blog blog = blogsevice.findById(id);
//        if (blog != null) {
//            ModelAndView modelAndView = new ModelAndView("blog/delete", "blog", blog);
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/delete-blog")
//    public String deleteBlog(@ModelAttribute(name = "blog") Blog blog) {
//        blogsevice.remove(blog);
//        return "redirect:/blog";
//    }
}
