package lesson35;

import lesson35.model.Hotel;
import lesson35.repository.HotelRepository;

public class DemoHotel {
    public static void main(String[] args) throws Exception {
        HotelRepository hotelRepository = new HotelRepository();
        Hotel hotel1 = new Hotel(1000L, "GrandOtel", "UK", "London", "Lodndokska");
        Hotel hotel2 = new Hotel(2000L, "Imperial","PL", "Wroclaw", "Wroclawska");

        //hotelRepository.writeToBD(hotel1,"/Users/mykytakazimirov/Desktop/HOBooking/HotelDb.txt");
        //hotelRepository.writeToBD(hotel2,"/Users/mykytakazimirov/Desktop/HOBooking/HotelDb.txt");

        //hotelRepository.readHotelBD("/Users/mykytakazimirov/Desktop/HOBooking/HotelDb.txt");

        hotelRepository.findHotelByName("Imperial");
    }
}
