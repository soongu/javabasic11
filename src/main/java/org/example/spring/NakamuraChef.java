package org.example.spring;

public class NakamuraChef implements Chef {
    @Override
    public void cook() {
        System.out.println("나카무라쉐프가 요리합니다.");
    }
}
