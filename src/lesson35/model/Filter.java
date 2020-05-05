package lesson35.model;

import lesson35.repository.GeneralDAO;
import lesson35.repository.Path;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Filter {
    private Integer numberOfGuests;
    private Double price;
    private Boolean breakfastIncluded;
    private Boolean petsAllowed;
    private Date dateAvailableFrom;
    private String name;
    private String country;
    private String city;

    GeneralDAO generalDAO = new GeneralDAO();
    Path path = new Path();

    public boolean testFilter(Room room) throws Exception {
        if (room != null){
            throw new Exception("FUCKKKKK");
        }
        if (numberOfGuests != 0 && room.getNumberOfGuests() != numberOfGuests) return false;
        if (price != 0 && room.getPrice() != price) return false;
        if (breakfastIncluded != null && room.getBreakfastIncluded() != breakfastIncluded) return false;
        if (petsAllowed != null && room.getPetsAllowed() != petsAllowed) return false;
        if (dateAvailableFrom != null && !dateAvailableFrom.equals(room.getDateAvailableFrom())) return false;
        if (name != null && !name.equals(room.getHotel().getName())) return false;
        if (country != null && !country.equals(room.getHotel().getCountry())) return false;
        if (city != null && !city.equals(room.getHotel().getCity())) return false;
        return true;
    }

    /*public Object roomFilter(Object obj) throws Exception {
        List<String> roomList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path.roomDB))) {
            String line;
            while ((line = br.readLine()) != null) {
                roomList.add(line);
            }

        }
        //List<Room> roomList = (List<Room>) generalDAO.readFile(path.roomDB);

        if (roomList.isEmpty())
            throw new Exception("Rooms is Empty");

        for (Room room : roomList) {
            if (room != null) {
                if (numberOfGuests != 0 && !room.getNumberOfGuests().equals(obj)) return false;
                /*if (numberOfGuests != 0 && room.getNumberOfGuests() != numberOfGuests && !room.getNumberOfGuests().equals(obj)) return false;
                if (price != 0 && room.getPrice() != price) return false;
                if (breakfastIncluded != null && room.getBreakfastIncluded() != breakfastIncluded) return false;
                if (petsAllowed != null && room.getPetsAllowed() != petsAllowed) return false;
                if (dateAvailableFrom != null && !dateAvailableFrom.equals(room.getDateAvailableFrom())) return false;
                if (name != null && !name.equals(room.getHotel().getName())) return false;
                if (country != null && !country.equals(room.getHotel().getCountry())) return false;
                if (city != null && !city.equals(room.getHotel().getCity())) return false;
            }
        }
        System.out.println("GOOD_TEST");
        return true;
    }*/



    /*public boolean roomFilter(Room rooms) {
        if (rooms != null) {
            if (numberOfGuests != 0 && room.getNumberOfGuests() != numberOfGuests) return false;
            if (price != 0 && room.getPrice() != price) return false;
            if (breakfastIncluded != null && room.getBreakfastIncluded() != breakfastIncluded) return false;
            if (petsAllowed != null && room.getPetsAllowed() != petsAllowed) return false;
            if (dateAvailableFrom != null && !dateAvailableFrom.equals(room.getDateAvailableFrom())) return false;
            if (name != null && !name.equals(room.getHotel().getName())) return false;
            if (country != null && !country.equals(room.getHotel().getCountry())) return false;
            if (city != null && !city.equals(room.getHotel().getCity())) return false;
        }
        return true;
    }*/


    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getBreakfastIncluded() {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(Boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }

    public Boolean getPetsAllowed() {
        return petsAllowed;
    }

    public void setPetsAllowed(Boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filter filter = (Filter) o;
        return Objects.equals(numberOfGuests, filter.numberOfGuests) &&
                Objects.equals(price, filter.price) &&
                Objects.equals(breakfastIncluded, filter.breakfastIncluded) &&
                Objects.equals(petsAllowed, filter.petsAllowed) &&
                Objects.equals(dateAvailableFrom, filter.dateAvailableFrom) &&
                Objects.equals(name, filter.name) &&
                Objects.equals(country, filter.country) &&
                Objects.equals(city, filter.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGuests, price, breakfastIncluded, petsAllowed, dateAvailableFrom, name, country, city);
    }

    @Override
    public String toString() {
        return "Filter{" +
                "numberOfGuests=" + numberOfGuests +
                ", price=" + price +
                ", breakfastIncluded=" + breakfastIncluded +
                ", petsAllowed=" + petsAllowed +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
