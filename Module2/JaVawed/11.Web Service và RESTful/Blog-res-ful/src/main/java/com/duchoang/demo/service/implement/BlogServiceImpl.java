package com.duchoang.demo.service.implement;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import com.duchoang.demo.repository.Repository;
import com.duchoang.demo.service.Blogsevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements Blogsevice {
    @Autowired
    private Repository repository;


    @Override
    public List<Blog> findAll() {
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
    public void remove(Blog blog) {
        repository.delete(blog);
    }

    @Override
    public List<Blog> findAllByCategory(Category category) {
        return repository.findAllByCategory(category);
    }

    @Override
    public List<Blog> findByIdBlog(Long id) {
        return repository.findByIdBlog(id);
    }


}
