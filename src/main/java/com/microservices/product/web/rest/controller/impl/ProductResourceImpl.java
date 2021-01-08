package com.microservices.product.web.rest.controller.impl;

import com.microservices.product.service.ProductService;
import com.microservices.product.service.response.ProductDetails;
import com.microservices.product.web.rest.controller.ProductResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller implementation for details of product.
 */
@RestController
public class ProductResourceImpl implements ProductResource {

    private final ProductService productService;

    public ProductResourceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<ProductDetails> getProduct(String productId) {
        return ResponseEntity.ok(productService.getProduct(productId));
    }
}
