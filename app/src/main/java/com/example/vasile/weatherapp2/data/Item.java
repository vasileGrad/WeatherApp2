package com.example.vasile.weatherapp2.data;

import org.json.JSONObject;

/**
 * Created by VASILE on 9/24/2017.
 */

public class Item implements JSONPopulator{
    private Condition condition;

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        // Inject that object
        condition.populate(data.optJSONObject("condition"));
    }
}
