package com.microservices.product.service.response;

import feign.Param;
import feign.RequestLine;

public interface ProductClient {

    @RequestLine("GET /api/products/{product_id}")
    ProductResponse getProductDetails(@Param("product_id") String productId);
}
