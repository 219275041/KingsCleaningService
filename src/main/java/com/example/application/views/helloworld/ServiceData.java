package com.example.application.views.helloworld;

public class ServiceData {
    private String serviceName;

    private String imageUrl;


    public ServiceData(String serviceName, String imageUrl) {
        this.serviceName = serviceName;
        this.imageUrl = imageUrl;

    }

    public String getServiceName() {
        return serviceName;
    }

    public String getImageUrl() {
        return imageUrl;
    }


}
