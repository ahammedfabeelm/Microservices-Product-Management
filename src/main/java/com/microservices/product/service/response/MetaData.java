package com.microservices.product.service.response;

public class MetaData {

    private String canonical;
    private String description;
    private String keywords;
    private String pageTitle;
    private String siteName;


    // Getter Methods

    public String getCanonical() {
        return canonical;
    }

    public String getDescription() {
        return description;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public String getSiteName() {
        return siteName;
    }

    // Setter Methods

    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
}

