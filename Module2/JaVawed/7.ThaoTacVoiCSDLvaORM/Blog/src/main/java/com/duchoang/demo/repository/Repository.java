package com.duchoang.demo.repository;

import com.duchoang.demo.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends PagingAndSortingRepository<Blog,Long> {

}
