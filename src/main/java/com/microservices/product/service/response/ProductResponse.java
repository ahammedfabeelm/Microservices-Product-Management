package com.microservices.product.service.response;

import java.util.ArrayList;

public class ProductResponse {

    private String id;
    private String modelNumber;
    private String name;
    MetaData metaData;
    private String productType;
    ProductDescription productDescription;
    private boolean recommendationsEnabled;
    PricingInformation pricingInformation;
    AttributeList attribute_list;
    ArrayList<Object> productLinkList = new ArrayList<>();
    ArrayList<Object> viewList = new ArrayList<>();
    ArrayList<Object> breadcrumbList = new ArrayList<>();
    Callouts callouts;
    Embellishment embellishment;


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public MetaData getMeta_data() {
        return metaData;
    }

    public String getProductType() {
        return productType;
    }

    public ProductDescription getProduct_description() {
        return productDescription;
    }

    public boolean getRecommendationsEnabled() {
        return recommendationsEnabled;
    }

    public PricingInformation getPricing_information() {
        return pricingInformation;
    }

    public AttributeList getAttribute_list() {
        return attribute_list;
    }

    public Callouts getCallouts() {
        return callouts;
    }

    public Embellishment getEmbellishment() {
        return embellishment;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeta_data(MetaData meta_dataObject) {
        this.metaData = meta_dataObject;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProduct_description(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public void setRecommendationsEnabled(boolean recommendationsEnabled) {
        this.recommendationsEnabled = recommendationsEnabled;
    }

    public void setPricing_information(PricingInformation pricing_informationObject) {
        this.pricingInformation = pricing_informationObject;
    }

    public void setAttribute_list(AttributeList attribute_listObject) {
        this.attribute_list = attribute_listObject;
    }

    public void setCallouts(Callouts calloutsObject) {
        this.callouts = calloutsObject;
    }

    public void setEmbellishment(Embellishment embellishmentObject) {
        this.embellishment = embellishmentObject;
    }
}










