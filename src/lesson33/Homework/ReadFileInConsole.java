package lesson33.Homework;

import lesson33.ReadFile;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadFileInConsole {

    public static void readFileByConsolePath() throws IOException {

        System.out.println("Please, enter file path to read: ");

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(streamReader);

        try {
            ReadFile.readFile(br.readLine());

        } catch (IOException e) {
            System.err.println("Can't read keyboard");
        } finally {
            try {
                if (streamReader != null)
                    streamReader.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Closing streams failed");
            }
        }
    }
}
