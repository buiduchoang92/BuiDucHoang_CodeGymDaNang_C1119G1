package com.codegym.reponsitory;

import com.codegym.model.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductReponsitory extends JpaRepository<Product ,Long> {
    @Query("select c from Product c where c.id=?1")
    Product findByIdZ(Long id);
}
