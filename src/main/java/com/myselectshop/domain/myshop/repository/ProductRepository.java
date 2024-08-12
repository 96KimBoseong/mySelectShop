package com.myselectshop.domain.myshop.repository;

import com.myselectshop.domain.myshop.model.Product;
import com.myselectshop.domain.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findAllByUser(User user, Pageable pageable);
}
