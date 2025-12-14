package com.cakeacoffee.weatherapi.example;

public class ExampleResponse {
    private String city;
    private int temperature;
    private String description;

    public ExampleResponse(String city, int temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }
    
}
