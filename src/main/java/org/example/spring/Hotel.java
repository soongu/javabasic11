package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

    private SuiteRoom room;
    private Restaurant restaurant;

    @Autowired
    public Hotel(SuiteRoom room, Restaurant restaurant) {
        this.room = room;
        this.restaurant = restaurant;
    }

    public void service() {
        room.reserve();
        restaurant.order();
    }
}
