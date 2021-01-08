package com.microservices.product.service.response;

import java.util.ArrayList;

public class ProductDescription {

    private String title;
    private String subtitle;
    private String text;
    DescriptionAssets descriptionAssets;
    ArrayList<Object> usps = new ArrayList<>();
    WashCareInstructions washCareInstructions;
    ArrayList<Object> productHighlights = new ArrayList<>();

    // Getter Methods

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getText() {
        return text;
    }

    public DescriptionAssets getDescriptionAssets() {
        return descriptionAssets;
    }

    public WashCareInstructions getWashCareInstructions() {
        return washCareInstructions;
    }

    // Setter Methods

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDescriptionAssets(DescriptionAssets descriptionAssets) {
        this.descriptionAssets = descriptionAssets;
    }

    public void setWashCareInstructions(WashCareInstructions washCareInstructions) {
        this.washCareInstructions = washCareInstructions;
    }
}


