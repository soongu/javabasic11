package org.example.spring;

public class Hotel {

    private SuiteRoom room = new SuiteRoom();
    private KoreanRestaurant restaurant = new KoreanRestaurant();

    public void service() {
        room.reserve();
        restaurant.order();
    }
}
