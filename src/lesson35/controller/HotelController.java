package lesson35.controller;

import lesson35.model.Hotel;
import lesson35.service.HotelService;

import java.util.List;

public class HotelController {

    private HotelService hotelService = new HotelService();

    public String findHotelByName(String name) throws Exception {
        return hotelService.findHotelByName(name);
    }
}
