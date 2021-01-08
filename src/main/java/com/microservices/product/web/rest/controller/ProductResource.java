package com.microservices.product.web.rest.controller;

import com.microservices.product.service.response.ProductDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST controller for details of product.
 */
@RequestMapping("/api")
public interface ProductResource {

    /**
     * {@code GET  /product/{product_id}} : get the review and details of a product.
     *
     * @param productId the id of the product to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)}
     * and with body the product, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/product/{product_id}")
    ResponseEntity<ProductDetails> getProduct(@PathVariable("product_id") String productId);
}
