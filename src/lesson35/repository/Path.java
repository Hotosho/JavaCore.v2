package lesson35.repository;

public class Path {
    public final String hotelDB = "src/lesson35/dataBase/HotelBD.txt";
    public final String roomDB = "src/lesson35/dataBase/RoomDB.txt";
    public final String userDB = "src/lesson35/dataBase/UserDB.txt";
    public final String orderDB = "src/lesson35/dataBase/OrderDB.txt";

    public String getHotelPath() {
        return hotelDB;
    }

    public String getRoomDB() {
        return roomDB;
    }

    public String getUserDB() {
        return userDB;
    }

    public String getOrderDB() {
        return orderDB;
    }
}
