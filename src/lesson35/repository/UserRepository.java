package lesson35.repository;

import lesson35.model.User;

import java.io.*;
import java.util.*;

public class UserRepository {
    private Validation validate = new Validation();

    public User registerUser(User user) throws Exception {
        writeToBD(user, "/Users/mykytakazimirov/Desktop/HOBooking/UserDb.txt");
        return user;
    }

    private void writeToBD(User user, String path) throws Exception {
        //validate(path);
        validate.validate(path);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            Random random = new Random();
            user.setId(random.nextLong());
            if (user.getId() < 0) {
                user.setId(-1 * user.getId());
            }
            bw.write(user.toString());
            //bw.append("\n");
        } catch (IOException e) {
            System.err.println(user + " Can't write to file");
        }
    }

    private List<String> readUserBD(String filePath) throws Exception {
        //validate(filePath);
        validate.validate(filePath);
        List<String> userList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                userList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("File with path " + filePath + " not found");
        }
        return userList;
    }

    private List<String> checkNameUser(User user, String filePath) throws Exception {
        List<String> userList = new ArrayList<>();
        String[] arrayUsers = readUserBD(filePath).toArray(new String[0]);
        for (String usr : arrayUsers) {
            if (usr != null && usr.contains(user.getUserName())) {
                throw new Exception(user + " with this name exists");
            } else {
                userList.add(usr);
            }
        }
        return userList;
    }


    private List<String> checkIdUser(User user, String filePath) throws Exception {
        List<String> userList = new ArrayList<>();
        String[] arrayUsers = readUserBD(filePath).toArray(new String[0]);
        for (String usr : arrayUsers) {
            long id = user.getId();
            String strId = Long.toString(id);
            if (usr != null && usr.contains(strId)) {
                throw new Exception(user + " with this ID exists");
            }
        }
        return userList;
    }

    /*protected void validate(String filePath) throws Exception {
        File fileBD = new File(filePath);

        if (!fileBD.exists()) {
            fileBD.createNewFile();
        }
        if (!fileBD.canRead()) {
            throw new Exception("File " + fileBD + " does not have permission to be read");
        }
        if (!fileBD.canWrite()) {
            throw new Exception("File " + fileBD + " does not have permission to be write");
        }
    }*/


}
