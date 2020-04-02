package lesson35.repository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class GeneralDAO<Q,W,E,R> {
    //private Validation validation = new Validation();


    public void writeToBD(List<Q> q, String path) throws Exception{

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(q);

            fileOutputStream.close();
            outputStream.close();

        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
