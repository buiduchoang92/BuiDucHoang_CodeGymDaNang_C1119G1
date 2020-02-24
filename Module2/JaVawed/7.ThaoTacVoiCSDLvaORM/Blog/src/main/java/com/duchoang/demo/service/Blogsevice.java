package com.duchoang.demo.service;

import com.duchoang.demo.model.Blog;
import org.hibernate.criterion.Order;

import java.util.List;

public interface Blogsevice {
    Iterable<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
