package org.example.spring;

import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    @DisplayName("스프링 없이 의존객체 주입해보기")
    void hotelTest() {

        Container con = new Container();

        Hotel hotel = con.hotel();

        hotel.service();

    }

    @Test
    @DisplayName("스프링으로 의존객체 주입해보기")
    void springTest() {
        // 스프링 컨테이너 불러오기
        AnnotationConfigApplicationContext con
                = new AnnotationConfigApplicationContext(Main.class);

        // 호텔 빈 꺼내기
        Hotel hotel = con.getBean(Hotel.class);

        hotel.service();

    }

}






