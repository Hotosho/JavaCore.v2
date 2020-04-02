package lesson35.model;

import java.util.Date;
import java.util.Objects;

public class Filter {
    private Integer numberOfGuests;
    private Double price;
    private Boolean breakfastIncluded;
    private Boolean petsAllowed;
    private Date dateAvailableFrom;
    private String country;
    private String city;

    public Filter(Integer numberOfGuests, Double price, Boolean breakfastIncluded, Boolean petsAllowed, Date dateAvailableFrom, String country, String city) {
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.breakfastIncluded = breakfastIncluded;
        this.petsAllowed = petsAllowed;
        this.dateAvailableFrom = dateAvailableFrom;
        this.country = country;
        this.city = city;
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getBreakfastIncluded() {
        return breakfastIncluded;
    }

    public Boolean getPetsAllowed() {
        return petsAllowed;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
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
                Objects.equals(country, filter.country) &&
                Objects.equals(city, filter.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGuests, price, breakfastIncluded, petsAllowed, dateAvailableFrom, country, city);
    }

    @Override
    public String toString() {
        return "Filter{" +
                "numberOfGuests=" + numberOfGuests +
                ", price=" + price +
                ", breakfastIncluded=" + breakfastIncluded +
                ", petsAllowed=" + petsAllowed +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
