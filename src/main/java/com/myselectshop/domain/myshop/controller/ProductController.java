package com.myselectshop.domain.myshop.controller;

import com.myselectshop.domain.myshop.dto.ProductMypriceRequestDto;
import com.myselectshop.domain.myshop.dto.ProductRequestDto;
import com.myselectshop.domain.myshop.dto.ProductResponseDto;
import com.myselectshop.domain.myshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        // 응답 보내기
        return productService.createProduct(requestDto);
    }

    // 관심 상품 희망 최저가 등록하기
    @PutMapping("/products/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        // 응답 보내기
        return productService.updateProduct(id, requestDto);
    }
}
