package com.duchoang.demo.service.implement;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import com.duchoang.demo.repository.CategoryRepository;
import com.duchoang.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySeerviceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Blog> findByName(Blog blog) {
        return categoryRepository.findByName(blog);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
    categoryRepository.save(category);
    }

    @Override
    public void remove(Category category) {
    categoryRepository.delete(category);
    }
}
