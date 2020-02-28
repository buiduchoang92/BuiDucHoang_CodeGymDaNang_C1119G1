package com.duchoang.demo.service;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    List<Blog> findByName(Blog blog);


    Category findById(Long id);

    void save(Category category);

    void remove(Category category);
}
