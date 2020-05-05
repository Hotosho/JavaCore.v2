package lesson35.repository;

public class RoomRepository {

    private GeneralDAO generalDAO = new GeneralDAO();

    public Object writeObject(Object obj, String path) throws Exception {
        return generalDAO.writeObject(obj, path);
    }
}
