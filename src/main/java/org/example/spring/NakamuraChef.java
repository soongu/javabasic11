package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class NakamuraChef implements Chef {
    @Override
    public void cook() {
        System.out.println("나카무라쉐프가 요리합니다.");
    }
}
