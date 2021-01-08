package com.microservices.product.service;

import com.microservices.product.service.response.ProductDetails;

/**
 * Service for details of product.
 */
public interface ProductService {

    ProductDetails getProduct(String productId);
}
