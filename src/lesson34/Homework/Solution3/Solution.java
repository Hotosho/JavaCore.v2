package lesson34.Homework.Solution3;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Solution {

    public static void copyFileContent(String fileFromPath, String fileToPath) throws Exception {
        validate(fileFromPath, fileToPath);
        FileReader fileFrom = new FileReader(fileFromPath);
        FileWriter fileTo = new FileWriter(fileToPath);

        while (fileFrom.ready()) {
            int test = fileFrom.read();
            fileTo.write(test);
        }
        fileFrom.close();
        fileTo.close();
    }

    public static void copyFileContentApacheIO(String fileFromPath, String fileToPath) throws IOException {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);
        FileUtils.copyFile(fileFrom, fileTo);

    }

    private static void validate(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFrom + " does not exist");
        }
        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }
        if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFrom + " does not have permission to be read");
        }
        if (!fileTo.canWrite()) {
            throw new Exception("File " + fileTo + " does not have permission to be write");
        }
    }
}
