package com.duchoang.demo.controller;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.service.Blogsevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private Blogsevice blogsevice;
    private Long id;

    @GetMapping("/blog")
    public ModelAndView showBlog(){
        return new ModelAndView("blog/list","blog",blogsevice.findAll());
    }
    @GetMapping("/create-blog")
    public ModelAndView createBlog(){
        return new ModelAndView("blog/create","blog",new Blog());
    }
    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute(name = "blog")Blog blog){
    blogsevice.save(blog);
    ModelAndView modelAndView = new ModelAndView("blog/create");
    modelAndView.addObject("blog",blog);
    modelAndView.addObject("message","Customer updated successfully");
    return modelAndView;
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView editBlog(@PathVariable Long id){
        Blog blog = blogsevice.findById(id);
        if (blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/edit","blog",blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-blog")
    public ModelAndView editBlog(@ModelAttribute(name = "blog")Blog blog){
        blogsevice.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message","Customer updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-blog/{id}")
    public ModelAndView deleteBlog(@PathVariable Long id){
        Blog blog = blogsevice.findById(id);
        if (blog!=null){
            ModelAndView modelAndView = new ModelAndView("blog/delete","blog",blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute(name = "blog")Blog blog){
        blogsevice.remove(blog.getIdBlog());
        return "redirect:/blog";
    }
}
