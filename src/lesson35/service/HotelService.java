package lesson35.service;

import lesson35.model.Hotel;
import lesson35.repository.HotelRepository;

import java.util.List;

public class HotelService {

    private HotelRepository hotelRepository = new HotelRepository();

    /*public String findHotelByName(String name) throws Exception {
        return hotelRepository.findHotelByName(name);
    }

    public String findHotelByCity(String city) throws Exception {
        return hotelRepository.findHotelByCity(city);
    }*/
    public Object findHotelByCityOrNameHotel(Object obj) throws Exception{
        return hotelRepository.findHotelByCityOrNameHotel(obj);
    }
}
