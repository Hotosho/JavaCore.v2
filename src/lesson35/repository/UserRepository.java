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
        writeToBD("/Users/mykytakazimirov/Desktop/UserDb.txt", user);
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
            bw.append(String.valueOf(user)).append(",");
            bw.append(user.getUserName()).append(",");
            bw.append(user.getPassword()).append(",");
            bw.append(user.getCountry()).append(",");
            bw.append(user.getUserType().toString());
            bw.append("\n");

        } catch (IOException e) {
            System.err.println(user + " Can't write to file");
        }
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
