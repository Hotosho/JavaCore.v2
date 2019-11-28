package lesson31.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {


    public Map<Character, Integer> countSymbols(String text) throws Exception {

        if (text == null)
            throw new Exception("Please enter above text");

        Map<Character, Integer> mapChar = new HashMap<>();
        ArrayList<Character> arrayChar = new ArrayList<>();


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isLetter(ch)) {
                break;
            } else {
                arrayChar.add(ch);
            }
        }

        for (Character ch1 : arrayChar) {
            int count = 0;
            for (Character ch2 : arrayChar) {
                if (ch1.equals(ch2)) {
                    count++;
                    mapChar.put(ch1, count);
                }
            }
        }
        return mapChar;
    }

    public Map<String, Integer> words(String text) throws Exception {

        if (text == null)
            throw new Exception("Please enter above text");
        if (text.length() < 3)
            throw new Exception("Please enter text minimum number of letters greater than 2");

        Map<String, Integer> mapStr = new HashMap<>();
        String[] arrayText = new String[0];
        for (int i = 0; i < text.length(); i++) {
            arrayText = text.trim().split(" ");

        }
        for (String str1 : arrayText) {
            int count = 0;
            for (String str2 : arrayText) {
                if (str1.equals(str2)) {
                    count++;
                    mapStr.put(str1, count);
                }
            }
        }
        return mapStr;
    }
}
