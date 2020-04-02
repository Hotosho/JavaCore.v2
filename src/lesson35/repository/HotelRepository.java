package lesson35.repository;

import lesson35.model.Hotel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class HotelRepository {

    private GeneralDAO generalDAO = new GeneralDAO();
    private Validation validate = new Validation();
    private String path = ("HotelBD.txt");

    public String findHotelByName(String name) throws Exception {
        List<Hotel> hotels = readHotelBD();

        if (hotels.size() > 0) {
            for (Hotel hotel : hotels) {
                if (hotel.getName().equals(name)) {
                    return hotel.toString();
                }
            }
        }
        return null;
    }

    public String findHotelByCity(String city) throws Exception {
        List<Hotel> hotels = readHotelBD();

        if (hotels.size() > 0) {
            for (Hotel hotel : hotels) {
                if (hotel.getCity().equals(city)) {
                    return hotel.toString();
                }
            }
        }
        return null;
    }

    private List<Hotel> readHotelBD() throws Exception {
        //userRepository.validate(path);
        validate.validate(path);

        List<Hotel> hotels = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(path));
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            hotels = (List<Hotel>) inputStream.readObject();

            fileInputStream.close();
            inputStream.close();

        } catch (EOFException eofe) {
            System.err.println(eofe);
            eofe.printStackTrace();
        } catch (IOException e) {
            System.err.println(e);
        }
        return hotels;
    }


    /*public void writeToBD(List<Hotel> hotel) throws Exception {
        //userRepository.validate(path);
        validate.validate(path);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(hotel);

            fileOutputStream.close();
            outputStream.close();

        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }*/



}

    /*public String findHotelByName(String name) throws Exception {
        List<String> listHotel = new ArrayList<>();
        for (String str : readHotelBD(path)) {
            if (str != null)
                listHotel.add(str);
        }

        String hotelName = "";
        for (String str : listHotel) {
            if (str != null && str.contains(name))
                hotelName += str;
        }
        System.out.println(hotelName);
        return hotelName;
    }

    public List<String> readHotelBD(String path) throws Exception {
        userRepository.validate(path);

        ArrayList<String> hotelList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                hotelList.add(line);
            }
        }
        //System.out.println(hotelList);
        return hotelList;
    }


    public void writeToBD(Hotel hotel) throws Exception {
        userRepository.validate(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(hotel.toString());
        } catch (IOException e) {
            System.err.println(hotel + " Can't write to file");
        }
    }*/




