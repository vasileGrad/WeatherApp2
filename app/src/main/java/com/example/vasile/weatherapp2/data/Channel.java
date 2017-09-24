package com.example.vasile.weatherapp2.data;

import org.json.JSONObject;

/**
 * Created by VASILE on 9/24/2017.
 */

public class Channel implements JSONPopulator{
    private Units units;
    private Item item;

    public Units getUnits() {
        return units;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public void populate(JSONObject data) {

        units = new Units();
        // Doing some dependencies injection
        // We are going to inject the JSON Objects
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));
    }
}
