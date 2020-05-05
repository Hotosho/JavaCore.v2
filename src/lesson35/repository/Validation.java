package lesson35.repository;

import java.io.File;

public class Validation {

    protected void validate(String filePath) throws Exception {
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

    }
}
