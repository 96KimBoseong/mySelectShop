package com.myselectshop.domain.myshop.repository;

import com.myselectshop.domain.myshop.model.Product;
import com.myselectshop.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findAllByUser(User user);
}
