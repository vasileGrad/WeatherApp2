package com.example.vasile.weatherapp2.service;

import com.example.vasile.weatherapp2.data.Channel;

/**
 * Created by VASILE on 9/24/2017.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
