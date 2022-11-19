package org.example.spring;

public class KoreanRestaurant implements Restaurant {

    private Chef chef;

    public KoreanRestaurant(Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("한식을 주문합니다.");
        chef.cook();
    }
}
