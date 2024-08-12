package com.myselectshop.domain.myshop.repository;

import com.myselectshop.domain.myshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
