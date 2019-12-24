package lesson33.Homework;


import java.io.*;

public class WriteToFile {
    public static void writeToFileFromConsole(String path) {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter file content to write in the file: ");

        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            String writeLine;
            String arrayResInput = " ";
            while ((writeLine = br.readLine()) != null && ((!writeLine.equals("wr")))) {
                arrayResInput += writeLine;
            }

            fileWriter = new FileWriter(path, true);
            bw = new BufferedWriter(fileWriter);
            bw.append(arrayResInput).append("\n");
        } catch (IOException e) {
            System.err.println("Can't write to file with path  " + path);
        } finally {
            try {
                if (br != null)
                    br.close();
                if (reader != null)
                    reader.close();
                if (bw != null)
                    bw.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                System.err.println("File with path " + path + " not found");
            }
        }
    }
}
