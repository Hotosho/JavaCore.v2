package lesson35;

import lesson35.controller.RoomController;
import lesson35.model.Filter;
import lesson35.model.Room;
import lesson35.repository.Path;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DemoRoom {
    public static void main(String[] args) throws Exception {
        DemoHotel demoHotel = new DemoHotel();
        RoomController roomController = new RoomController();
        Path path = new Path();
        Filter filter = new Filter();


        Room room1 = new Room(12345L, 5, 500.00, true, false, new Date(), demoHotel.hotel1);
        Room room2 = new Room(67890L, 3, 200.00, false, false, new Date(), demoHotel.hotel2);
        Room room3 = new Room(43298L, 2, 1000.00, true, true, new Date(), demoHotel.hotel3);
        Room room4 = new Room(00000L, 6, 5000.00, true, false, new Date(), demoHotel.hotel1);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        //roomController.writeObject(rooms, path.roomDB);
        //filter.roomFilter(room1);
        filter.testFilter(room4);

    }
}
