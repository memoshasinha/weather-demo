package com.piyush.weatherapp.weather_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherApi {

    @Autowired
    WeatherService weatherService;

    @RequestMapping("/api/location/search")
    public List<Weather> getLocationByName(@RequestParam(name="query", required=false, defaultValue="san") String name) {
        return weatherService.getLocationByName(name);
    }
}
