package com.microservices.product.service.response;

public class PricingInformation {

    private float standardPrice;
    private float standardPriceNoVat;
    private float currentPrice;


    // Getter Methods

    public float getStandardPrice() {
        return standardPrice;
    }

    public float getStandardPriceNoVat() {
        return standardPriceNoVat;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    // Setter Methods

    public void setStandardPrice(float standardPrice) {
        this.standardPrice = standardPrice;
    }

    public void setStandardPriceNoVat(float standardPriceNoVat) {
        this.standardPriceNoVat = standardPriceNoVat;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }
}

