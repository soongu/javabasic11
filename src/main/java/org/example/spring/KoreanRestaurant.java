package org.example.spring;

public class KoreanRestaurant {

    private KimChef chef = new KimChef();

    public void order() {
        System.out.println("한식을 주문합니다.");
        chef.cook();
    }
}
