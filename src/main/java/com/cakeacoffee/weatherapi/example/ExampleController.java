package com.cakeacoffee.weatherapi.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    /** --- Return JSON --- **/
    @GetMapping("/api/weather")
    public ExampleResponse getWeather() {
        return new ExampleResponse(
                "London",
                18,
                "Cloudy"
        );
    }
    
}
