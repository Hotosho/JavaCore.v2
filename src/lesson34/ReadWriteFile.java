package lesson34;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        readFile("/Users/mykytakazimirov/Desktop/HomeWork33.txt");
        //writeFile("/Users/mykytakazimirov/Desktop/test1.txt");

    }

    private static void readFile(String path) throws FileNotFoundException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("File with path " + path + " not found");
        }

    }

    private static void writeFile(String path) throws InterruptedException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append("\n");
            bufferedWriter.append("qwert");
        } catch (IOException e) {
            System.err.println("Can't write to file");
        }
    }
}
