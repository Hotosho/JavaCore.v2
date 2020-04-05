package lesson35;

import lesson35.model.Filter;
import lesson35.model.Hotel;
import lesson35.model.Room;
import lesson35.repository.GeneralDAO;
import lesson35.repository.Path;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemoRoom {
    public static void main(String[] args) throws Exception {
        GeneralDAO generalDAO = new GeneralDAO();
        Path path = new Path();
        Filter filter = new Filter();

        Hotel hotel1 = new Hotel(1000L, "GrandOtel", "UK", "London", "Lodndokska");
        Hotel hotel2 = new Hotel(2000L, "Imperial", "PL", "Wroclaw", "Wroclawska");
        Room room1 = new Room(3424L, 5, 5000D, true, true, new Date(), hotel1);
        Room room2 = new Room( 3456564L, 3, 3000D, true, false, new Date(), hotel2);

        List<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);

        generalDAO.writeObject(rooms,path.roomPath);
        filter.roomFilter(rooms);





    }
}
