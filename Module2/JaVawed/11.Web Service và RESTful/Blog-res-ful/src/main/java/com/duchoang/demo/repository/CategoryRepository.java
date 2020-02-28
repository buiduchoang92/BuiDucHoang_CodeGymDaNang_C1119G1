package com.duchoang.demo.repository;
import com.duchoang.demo.model.Blog;
import com.duchoang.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select b from Category b")
    List<Blog> findByName(Blog blog);
    List<Category> findAll();


}
