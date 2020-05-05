package lesson35.controller;

import lesson35.service.RoomService;

public class RoomController {

    private RoomService roomService = new RoomService();

    public Object writeObject(Object obj, String path) throws Exception {
        return roomService.writeObject(obj, path);
    }
}
