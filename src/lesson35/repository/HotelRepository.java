package lesson35.repository;

import lesson35.model.Hotel;
import netscape.javascript.JSObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class HotelRepository {

    private UserRepository userRepository = new UserRepository();

    public String findHotelByName(String name) throws Exception {
        List<String> listHotel = new ArrayList<>();
        for (String str : readHotelBD("/Users/mykytakazimirov/Desktop/HOBooking/HotelDb.txt")) {
            if (str != null)
                listHotel.add(str);
        }

        String hotelName = "";
        for (String strName : listHotel) {
            if (strName != null && strName.contains(name))
                hotelName += strName;
        }

        return hotelName;
    }

    private List<String> readHotelBD(String path) throws Exception {
        userRepository.validate(path);
        ArrayList<String> hotelList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                hotelList.add(line);
            }
        }
        return hotelList;

    }


    public void writeToBD(Hotel hotel, String path) throws Exception {
        userRepository.validate(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(hotel.toString());
        } catch (IOException e) {
            System.err.println(hotel + " Can't write to file");
        }
    }

}
