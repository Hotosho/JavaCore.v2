package lesson35.repository;

import lesson35.model.Hotel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public abstract class GeneralDAO<T> {
    //private Validation validation = new Validation();
    private String path;

    public GeneralDAO(String path) {
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void writeToBD(List<T> t) throws Exception {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(t);

            fileOutputStream.close();
            outputStream.close();

        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

}
