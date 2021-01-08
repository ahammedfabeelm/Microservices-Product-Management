package com.microservices.product.service.response;

public class ProductDetails {

    private Product product;

    private ProductResponse response;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductResponse getResponse() {
        return response;
    }

    public void setResponse(ProductResponse response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
            "product=" + product +
            ", response=" + response +
            '}';
    }
}
