package com.duchoang.demo.service;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface Blogsevice {


    List<Blog> findAll();
//    Page<Blog> findAllByName(String name, Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Blog blog);

    List<Blog> findAllByCategory(Category category);

    List<Blog> findByIdBlog(Long id);

}
