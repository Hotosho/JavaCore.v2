package lesson35.repository;

import lesson35.model.User;

import java.io.*;
import java.util.Random;

public class UserRepository {
    //считать данные - считывание файла
    //обработка данных - маппинг данных


    public User registerUser(User user) throws Exception {
        //save user to db (file)
        // cсгенерировать idUser и передать это все в бд
        checkNameUser(user, "/Users/mykytakazimirov/Desktop/HOBooking/UserDb.txt");
        checkIdUser(user, "/Users/mykytakazimirov/Desktop/HOBooking/UserDb.txt");
        writeToBD("/Users/mykytakazimirov/Desktop/HOBooking/UserDb.txt", user);
        return user;
    }

    private void writeToBD(String path, User user) throws Exception {
        validate(path);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            Random random = new Random();
            user.setId(random.nextLong());
            if (user.getId() < 0) {
                user.setId(-1 * user.getId());
            }
            bw.write(user.toString());
            bw.append("\n");

        } catch (IOException e) {
            System.err.println(user + " Can't write to file");
        }
    }

    private StringBuffer readUserBD(String filePath) throws Exception {
        validate(filePath);
        StringBuffer sb = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("File with path " + filePath + " not found");
        }
        return sb;
    }

    private boolean checkNameUser(User user, String filePath) throws Exception {
        if (user.getUserName().contentEquals(readUserBD(filePath))) {
            throw new Exception(user + " user with the same name already exists");
        }
        return false;
    }

    private boolean checkIdUser(User user, String filePath) throws Exception {
        if (readUserBD(filePath).equals(user.getId())) {
            throw new Exception(user + " user already exists");
        }
        return false;
    }

    private static void validate(String filePath) throws Exception {
        File fileBD = new File(filePath);

        if (!fileBD.exists()) {
            throw new FileNotFoundException("File " + fileBD + " does not from");
        }
        if (!fileBD.canRead()) {
            throw new Exception("File " + fileBD + " does not have permission to be read");
        }
        if (!fileBD.canWrite()) {
            throw new Exception("File " + fileBD + " does not have permission to be write");
        }
    }


}
