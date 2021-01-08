package com.microservices.product.service.impl;

import com.microservices.product.client.ProductClient;
import com.microservices.product.service.ProductService;
import com.microservices.product.service.response.Product;
import com.microservices.product.service.response.ProductDetails;
import com.microservices.product.service.response.ProductResponse;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.stereotype.Service;

/**
 * Service Implementation for details of product.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDetails getProduct(String productId) {

        ProductClient productClient = Feign.builder()
            .client(new OkHttpClient())
            .encoder(new JacksonEncoder())
            .decoder(new JacksonDecoder())
            .logger(new Slf4jLogger(ProductClient.class))
            .logLevel(Logger.Level.FULL)
            .target(ProductClient.class, "http://www.adidas.co.uk");

        ProductResponse response = productClient.getProductDetails(productId);

        ProductClient client = Feign.builder()
            .client(new OkHttpClient())
            .encoder(new JacksonEncoder())
            .decoder(new JacksonDecoder())
            .logger(new Slf4jLogger(ProductClient.class))
            .logLevel(Logger.Level.FULL)
            .target(ProductClient.class, "http://localhost:8081/review");
        Product product = client.getReview(productId);

        ProductDetails productDetails = new ProductDetails();
        productDetails.setProduct(product);
        productDetails.setResponse(response);
        return productDetails;
    }
}
