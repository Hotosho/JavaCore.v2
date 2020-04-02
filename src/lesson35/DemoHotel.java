package lesson35;

import lesson35.model.Hotel;
import lesson35.repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;


public class DemoHotel {
    public static void main(String[] args) throws Exception {
        HotelRepository hotelRepository = new HotelRepository();
        Hotel hotel1 = new Hotel(1000L, "GrandOtel", "UK", "London", "Lodndokska");
        Hotel hotel2 = new Hotel(2000L, "Imperial", "PL", "Wroclaw", "Wroclawska");

        List<Hotel> hotels = new ArrayList<>();

        hotels.add(hotel1);
        hotels.add(hotel2);
        //hotelRepository.writeToBD(hotels);


        String hotelName = hotelRepository.findHotelByName("GrandOtel");
        System.out.println(hotelName);

        String hotelCity = hotelRepository.findHotelByCity("Wroclaw");
        System.out.println(hotelCity);
        //hotelRepository.writeToBD(hotel1);
        //hotelRepository.writeToBD(hotel2);
        //hotelRepository.readHotelBD("/Users/mykytakazimirov/Desktop/HOBooking/HotelDb.txt");
        //hotelRepository.readHotelBD("/Users/mykytakazimirov/Desktop/HOBooking/HotelDb.txt");
        //hotelRepository.findHotelByName("Imperial");
        //ArrayList<Hotel> hotels = new ArrayList<>();
        //hotels.add(hotel1);
        //hotels.add(hotel2);
        //hotelRepository.readHotelBD();
        //hotelRepository.writeToBD(hotels);
    }
}


