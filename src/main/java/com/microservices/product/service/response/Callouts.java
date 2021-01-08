package com.microservices.product.service.response;

import java.util.ArrayList;
import java.util.List;

public class Callouts {

    List<Object> calloutBottomStack = new ArrayList<>();

    public List<Object> getCalloutBottomStack() {
        return calloutBottomStack;
    }

    public void setCalloutBottomStack(List<Object> calloutBottomStack) {
        this.calloutBottomStack = calloutBottomStack;
    }
}
