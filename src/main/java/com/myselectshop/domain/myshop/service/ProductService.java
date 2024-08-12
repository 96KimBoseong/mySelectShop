package com.myselectshop.domain.myshop.service;

import com.myselectshop.domain.myshop.dto.ProductRequestDto;
import com.myselectshop.domain.myshop.dto.ProductResponseDto;
import com.myselectshop.domain.myshop.model.Product;
import com.myselectshop.domain.myshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }

}
