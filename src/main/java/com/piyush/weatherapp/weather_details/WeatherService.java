package com.piyush.weatherapp.weather_details;
import io.swagger.models.HttpMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class WeatherService {

    @Value("${metaweather.base.url}")
    private String baseUrl;

    public List<Weather> getLocationByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Weather[]> responseEntity = restTemplate.getForEntity(baseUrl+"/api/location/search/?query="+name, Weather[].class);
        log.info(String.valueOf(responseEntity));
        return  Arrays.asList(responseEntity.getBody());
    }
}
