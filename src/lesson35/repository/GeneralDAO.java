package lesson35.repository;

import java.io.*;

public class GeneralDAO {

    private Validation validation = new Validation();
    private FileInputStream fileInputStream;
    private ObjectInputStream inputStream;
    private FileOutputStream fileOutputStream;
    private ObjectOutputStream outputStream;

    public Object readFile(String path) throws Exception {
        validation.validate(path);

        try {
            fileInputStream = new FileInputStream(new File(path));
            inputStream = new ObjectInputStream(fileInputStream);

            return inputStream.readObject();
        } catch (EOFException eofe) {
            System.err.println(eofe);
            eofe.printStackTrace();
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            fileInputStream.close();
            inputStream.close();
        }
        return null;
    }

    public Object writeObject(Object obj, String path) throws Exception {
        validation.validate(path);
        try {
            fileOutputStream = new FileOutputStream(new File(path));
            outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(obj);
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        } finally {
            fileOutputStream.close();
            outputStream.close();
        }
        return null;
    }
}
