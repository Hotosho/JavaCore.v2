package lesson35.controller;


import lesson35.service.HotelService;


public class HotelController {

    private HotelService hotelService = new HotelService();

    public Object writeObject(Object obj, String path) throws Exception {
        return hotelService.writeObject(obj, path);
    }

}
