package com.piyush.weatherapp.weather_details;

import lombok.Data;

@Data
public class Weather {
    private String title;
    private String location_type;
    private int woeid;
    private String latt_long;
}
