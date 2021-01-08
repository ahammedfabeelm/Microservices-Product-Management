package com.microservices.product.service.response;

import java.util.ArrayList;
import java.util.List;

public class WashCareInstructions {

    List<Object> careInstructions = new ArrayList<>();

    public List<Object> getCareInstructions() {
        return careInstructions;
    }

    public void setCareInstructions(List<Object> careInstructions) {
        this.careInstructions = careInstructions;
    }
}


