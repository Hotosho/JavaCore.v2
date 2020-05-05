package lesson35.service;


import lesson35.repository.HotelRepository;



public class HotelService {

    private HotelRepository hotelRepository = new HotelRepository();

    public Object writeObject(Object obj, String path) throws Exception {
        return hotelRepository.writeObject(obj, path);
    }
}
