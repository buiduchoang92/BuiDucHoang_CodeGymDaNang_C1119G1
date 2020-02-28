package com.duchoang.demo.repository;

import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Blog,Long> {
    @Query("select b from Blog b")
    List<Blog> findAll();
//    @Query("select c from Category c")
//    List<Category> findAll();
List<Blog> findAllByCategory(Category category);

List<Blog> findByIdBlog(Long id);
}
