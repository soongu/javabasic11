package org.example.spring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotelTest() {

        Container con = new Container();

        Hotel hotel = con.hotel();

        hotel.service();

    }

}