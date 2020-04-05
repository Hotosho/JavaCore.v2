package lesson35;

import lesson35.model.Hotel;
import lesson35.repository.GeneralDAO;
import lesson35.repository.HotelRepository;
import lesson35.repository.Path;

import java.util.ArrayList;
import java.util.List;


public class DemoHotel {


    public static void main(String[] args) throws Exception {
        HotelRepository hotelRepository = new HotelRepository();
        GeneralDAO generalDAO = new GeneralDAO();
        Path path = new Path();
        Hotel hotel1 = new Hotel(1000L, "GrandOtel", "UK", "London", "Lodndokska");
        Hotel hotel2 = new Hotel(2000L, "Imperial", "PL", "Wroclaw", "Wroclawska");
        Hotel hotel3 = new Hotel(3000L, "QWERT", "US", "NewYork", "Amazonsk");

        List<Hotel> hotels = new ArrayList<>();

        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);

        generalDAO.writeObject(hotels, path.hotelPath);

        // the method works by searching for the name of the hotel or city
        String findHotel = (String) hotelRepository.findHotelByCityOrNameHotel("London");
        System.out.println(findHotel);

    }
}


