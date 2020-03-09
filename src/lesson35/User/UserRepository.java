package lesson35.User;

import java.io.*;

public class UserRepository {
    //считать данные - считывание файла
    //обработка данных - маппинг данных

    public boolean checkFindById(long id, String pathBD) throws Exception {
        validate(pathBD);
        try (BufferedReader br = new BufferedReader(new FileReader(pathBD))) {
            String line;
            String resLine = "";

            while ((line = br.readLine()) != null) {
                resLine += line;
            }
            String[] arrayResults = resLine.split(",");
            String strID = Long.toString(id);

            for (String findId : arrayResults) {
                if (findId != null && findId.contains(strID)) {
                    return false;
                }
            }
        }
        return true;
    }

    public User registerUser(User user) {
        //save user to db (file)
        // cсгенерировать idUser и передать это все в бд
        return user;
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
