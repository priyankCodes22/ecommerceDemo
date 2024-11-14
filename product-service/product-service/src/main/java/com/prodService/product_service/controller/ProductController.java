package com.prodService.product_service.controller;

import com.prodService.product_service.model.Product;
import com.prodService.product_service.service.ProductServInterface;
import com.prodService.product_service.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServInterface productService;

    public ProductController(ProductServInterface productService) {
        this.productService = productService;
    }

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
