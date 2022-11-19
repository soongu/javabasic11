package org.example.spring;

import org.springframework.stereotype.Component;

@Component // 스프링한테 객체의 생명주기를 맡기기
public class KimChef implements Chef {

    public void cook() {
        System.out.println("김쉐프가 요리합니다.");
    }
}
