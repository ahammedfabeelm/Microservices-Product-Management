package com.microservices.product.service.response;

public class Product {

    private String productId;

    private Integer averageReviewScore;

    private Integer numberOfReview;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAverageReviewScore() {
        return averageReviewScore;
    }

    public void setAverageReviewScore(Integer averageReviewScore) {
        this.averageReviewScore = averageReviewScore;
    }

    public Integer getNumberOfReview() {
        return numberOfReview;
    }

    public void setNumberOfReview(Integer numberOfReview) {
        this.numberOfReview = numberOfReview;
    }

    @Override
    public String toString() {
        return "Product{" +
            "productId='" + productId + '\'' +
            ", averageReviewScore=" + averageReviewScore +
            ", numberOfReview=" + numberOfReview +
            '}';
    }
}
