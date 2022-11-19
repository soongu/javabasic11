package org.example.spring;

public class FrenchRestaurant {

    private KimChef chef = new KimChef();

    public void order() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
