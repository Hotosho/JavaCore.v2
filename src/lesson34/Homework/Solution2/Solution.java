package lesson34.Homework.Solution2;

import java.io.*;

public class Solution {

    public static void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {
        validate(fileFromPath, fileToPath);
        writeToFile(fileToPath, readFileForSentences(fileFromPath, word));

        deleteFromFileSentencesWithWord(fileFromPath, word);
    }

    private static void writeToFile(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
            bw.append(contentToWrite);
        } catch (IOException e) {
            System.err.println("Can't write to file" + path);
        }
    }

    private static StringBuffer readFileForSentences(String path, String word) throws IOException {
        StringBuffer result = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            String resLine = "";

            while ((line = br.readLine()) != null) {
                resLine += line;
            }

            String[] arraySentences = resLine.trim().split("\\.");

            for (String sent : arraySentences) {
                if (sent != null && sent.contains(word) && sent.toCharArray().length > 10) {
                    result.append(sent.trim()).append(".");
                    result.append("\n");
                }
            }

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist " + path);
        } catch (IOException e) {
            throw new IOException("Reading from file " + path + " failed");
        }
        return result;
    }

    private static void deleteFromFileSentencesWithWord(String path, String word) throws IOException {
        StringBuffer result = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            String resLine = "";
            while ((line = br.readLine()) != null) {
                resLine += line;
            }
            String[] arraySentences = resLine.split("\\.");

            for (String delete : arraySentences) {
                if (delete != null && !delete.contains(word) && delete.toCharArray().length < 10) ;
                delete = "";
                result.append(delete);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist " + path);
        } catch (IOException e) {
            throw new IOException("Reading from file " + path + " failed");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.append(result);
        } catch (IOException e) {
            throw new IOException("Can not write to file " + path);
        }
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
