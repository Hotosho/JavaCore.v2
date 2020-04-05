package lesson35.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Filter {
    Room room = new Room();
    private Integer numberOfGuests;
    private Double price;
    private Boolean breakfastIncluded;
    private Boolean petsAllowed;
    private Date dateAvailableFrom;
    private String name;
    private String country;
    private String city;

    public boolean roomFilter(List<Room> rooms) {
        if (!rooms.isEmpty()) {
            for (Room room : rooms) {
                if (numberOfGuests != 0 && room.getNumberOfGuests() != numberOfGuests) return false;
                if (price != 0 && room.getPrice() != price) return false;
                if (breakfastIncluded != null && room.getBreakfastIncluded() != breakfastIncluded) return false;
                if (petsAllowed != null && room.getPetsAllowed() != petsAllowed) return false;
                if (dateAvailableFrom != null && !dateAvailableFrom.equals(room.getDateAvailableFrom())) return false;
                if (name != null && !name.equals(room.getHotel().getName())) return false;
                if (country != null && !country.equals(room.getHotel().getCountry())) return false;
                if (city != null && !city.equals(room.getHotel().getCity())) return false;
                System.out.println(room.toString());
            }
        }
        return true;
    }

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
