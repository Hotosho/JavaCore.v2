package lesson35.service;

import lesson35.repository.RoomRepository;

public class RoomService {

    private RoomRepository roomRepository = new RoomRepository();

    public Object writeObject(Object obj, String path) throws Exception {
        return roomRepository.writeObject(obj, path);
    }
}
