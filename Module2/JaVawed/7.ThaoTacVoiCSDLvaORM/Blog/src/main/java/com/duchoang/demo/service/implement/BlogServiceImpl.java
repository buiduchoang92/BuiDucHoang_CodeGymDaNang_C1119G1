package com.duchoang.demo.service.implement;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.repository.Repository;
import com.duchoang.demo.service.Blogsevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements Blogsevice {
    @Autowired
    private Repository repository;

    @Override
    public Iterable<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
