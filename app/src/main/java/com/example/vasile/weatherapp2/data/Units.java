package com.example.vasile.weatherapp2.data;

import org.json.JSONObject;

/**
 * Created by VASILE on 9/24/2017.
 */

public class Units implements JSONPopulator{
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
