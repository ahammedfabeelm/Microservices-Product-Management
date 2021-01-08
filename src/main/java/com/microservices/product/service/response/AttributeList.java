package com.microservices.product.service.response;

import java.util.ArrayList;

public class AttributeList {
    ArrayList<Object> collection = new ArrayList<>();
    ArrayList<Object> productType = new ArrayList<>();
    ArrayList<Object> sport = new ArrayList<>();
    ArrayList<Object> sportSub = new ArrayList<>();
    private boolean isInPreview;
    private boolean customizable;
    private boolean isCnCRestricted;
    private boolean isWaitingRoomProduct;
    private boolean mandatoryPersonalization;
    private boolean outlet;
    private boolean personalizable;
    private boolean sale;
    private boolean specialLaunch;
    private String specialLaunchType;
    private String gender;
    private String category;
    private String searchColor;
    private String searchColorRaw;
    private String brand;
    private String color;
    private String pricebook;
    private String hashtag;
    private boolean comingSoonSignup;
    private String previewTo;
    private String sizeChartLink;


    // Getter Methods

    public boolean getIsInPreview() {
        return isInPreview;
    }

    public boolean getCustomizable() {
        return customizable;
    }

    public boolean getIsCnCRestricted() {
        return isCnCRestricted;
    }

    public boolean getIsWaitingRoomProduct() {
        return isWaitingRoomProduct;
    }

    public boolean getMandatoryPersonalization() {
        return mandatoryPersonalization;
    }

    public boolean getOutlet() {
        return outlet;
    }

    public boolean getPersonalizable() {
        return personalizable;
    }

    public boolean getSale() {
        return sale;
    }

    public boolean getSpecialLaunch() {
        return specialLaunch;
    }

    public String getSpecialLaunchType() {
        return specialLaunchType;
    }

    public String getGender() {
        return gender;
    }

    public String getCategory() {
        return category;
    }

    public String getSearchColor() {
        return searchColor;
    }

    public String getSearchColorRaw() {
        return searchColorRaw;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getPricebook() {
        return pricebook;
    }

    public String getHashtag() {
        return hashtag;
    }

    public boolean getComingSoonSignup() {
        return comingSoonSignup;
    }

    public String getPreviewTo() {
        return previewTo;
    }

    public String getSizeChartLink() {
        return sizeChartLink;
    }

    // Setter Methods

    public void setIsInPreview(boolean isInPreview) {
        this.isInPreview = isInPreview;
    }

    public void setCustomizable(boolean customizable) {
        this.customizable = customizable;
    }

    public void setIsCnCRestricted(boolean isCnCRestricted) {
        this.isCnCRestricted = isCnCRestricted;
    }

    public void setIsWaitingRoomProduct(boolean isWaitingRoomProduct) {
        this.isWaitingRoomProduct = isWaitingRoomProduct;
    }

    public void setMandatoryPersonalization(boolean mandatoryPersonalization) {
        this.mandatoryPersonalization = mandatoryPersonalization;
    }

    public void setOutlet(boolean outlet) {
        this.outlet = outlet;
    }

    public void setPersonalizable(boolean personalizable) {
        this.personalizable = personalizable;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public void setSpecialLaunch(boolean specialLaunch) {
        this.specialLaunch = specialLaunch;
    }

    public void setSpecialLaunchType(String specialLaunchType) {
        this.specialLaunchType = specialLaunchType;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSearchColor(String searchColor) {
        this.searchColor = searchColor;
    }

    public void setSearchColorRaw(String searchColorRaw) {
        this.searchColorRaw = searchColorRaw;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPricebook(String pricebook) {
        this.pricebook = pricebook;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setComingSoonSignup(boolean comingSoonSignup) {
        this.comingSoonSignup = comingSoonSignup;
    }

    public void setPreviewTo(String previewTo) {
        this.previewTo = previewTo;
    }

    public void setSizeChartLink(String sizeChartLink) {
        this.sizeChartLink = sizeChartLink;
    }
}

