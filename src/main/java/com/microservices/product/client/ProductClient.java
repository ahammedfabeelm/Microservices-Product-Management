package com.microservices.product.client;

import com.microservices.product.service.response.Product;
import com.microservices.product.service.response.ProductResponse;
import feign.Param;
import feign.RequestLine;

public interface ProductClient {

    @RequestLine("GET /api/products/{product_id}")
    ProductResponse getProductDetails(@Param("product_id") String productId);

    @RequestLine("GET /api/review/{product_id}")
    Product getReview(@Param("product_id") String productId);
}
