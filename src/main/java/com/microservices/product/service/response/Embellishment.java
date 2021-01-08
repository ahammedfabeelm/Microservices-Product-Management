package com.microservices.product.service.response;

import java.util.ArrayList;

public class Embellishment {

    ArrayList<Object> embellishmentOptions = new ArrayList<>();
    private String articleType;


    // Getter Methods

    public String getArticleType() {
        return articleType;
    }

    // Setter Methods

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }
}

