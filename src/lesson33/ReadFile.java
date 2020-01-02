package lesson33;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        readFile("/Users/mykytakazimirov/Desktop/HomeWork33.txt");
        writeFile("/Users/mykytakazimirov/Desktop/test1.txt");

    }

    public static void readFile(String path) throws FileNotFoundException {

        FileReader reader;
        try {
            reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + path + " not found");
            return;
        }
        BufferedReader br = new BufferedReader(reader);

        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Can't read file by path" + path);
        } finally {
            try {
                if (br != null)
                    br.close();
                if (reader != null)
                    reader.close();
            }catch (IOException e){
                System.out.println("Closing streams failed");
            }
        }

    }

    private static void writeFile(String path) throws InterruptedException {

        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            //writer = new FileWriter(new File(path), true);
            //or
            writer = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.append("\n");
            bufferedWriter.append("qwert");
        }catch (IOException e){
            System.err.println("Can't write to file");
        }finally {
            IOUtils.closeQuietly(bufferedWriter);
            IOUtils.closeQuietly(writer);
        }
    }
}
