package walidator;

//Prosty walidator adresów w sieci internet
//-----
//Wymagania: adres powinien zaczynać się od nazwy protokołu, dopuszczalne - http:// lub https:// www niekoniecznie blast
// strefa powinna być oddzielone kropką, dopuszczalne - com, org, net, inne punkty w tytule adresy niedozwolone

public class Solution {
    public static void main(String[] args) {
        //String test = "444Everything you need to know about the the Boeing";
        String link = "https://githab.com";


        //System.out.println(countWords(test));
        //System.out.println(maxWord(test));
        //System.out.println(minWord(test));
        //System.out.println(mostCountedWord(test));
        System.out.println(validate(link));

    }

    public static boolean validate(String address) {
        //walidator adresów w sieci internet

        if (address == null)
            return false;
        address.trim();

        if (!address.startsWith("https://") && !address.startsWith("http://"))
            return false;
        if (!address.endsWith(".com") && !address.endsWith(".net") && !address.endsWith(".org"))
            return false;

        address = isValid(address, new String[]{"http://", "https://"});
        address = address != null && address.startsWith("www.") ? address.replaceFirst("www.", "") : address;
        address = isValid(address, new String[]{".net", ".com", ".org"});

        return address != null && address.length() > 0 && checkLink(address);
    }

    private static String isValid(String address, String[] parts) {
        for (String part : parts) {
            if (address.contains(part)) {
                address = address.replaceFirst(part, "");
                return address;
            }
        }
        return null;
    }

    private static boolean checkLink(String input) {

        char[] chars = input.trim().toCharArray();

        for (char ch : chars) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }


   /* private static boolean checkWords(String input) {

        char[] chars = input.toCharArray();
        for (char letter : chars) {
            if (!Character.isLetter(letter)) {
                return false;
            }
        }
        return !input.isEmpty();
    }*/


    /*public static int countWords(String input) {
//Napisz metoda do liczenia słów w nadchodzącym stringie
        int counter = 0;

        String[] strings = input.split(" ");

        for (String word : strings) {
            if (checkWords(word)) {
                counter++;
            }
        }
        return counter;
    }*/

   /* public static String maxWord(String input) {
        //Napisz metody wyszukiwania najdłuższego i najbardziej krótkiego słowa w nadchodzącym stringie

        String[] words = input.split(" ");

        if (words.length == 0)
            return null;

        String maxWord = null;

        for (String word : words) {
            if (word.length() > 0 && checkWords(word)) {
                maxWord = word;
                break;
            }
        }
        if (maxWord == null)
            return null;

        for (String word : words) {
            if (word.length() > maxWord.length() && checkWords(word)) {
                maxWord = word;
            }
        }

        return maxWord;

    } */

    /*public static String minWord(String input) {

        String[] words = input.split(" ");

        if (words.length == 0)
            return null;

        String minWord = null;

        for (String word : words) {
            if (word.length() > 0 && checkWords(word)) {
                minWord = word;
                break;
            }
        }
        if (minWord == null)
            return null;

        for (String word : words) {
            if (word.length() < minWord.length() && checkWords(word)) {
                minWord = word;
            }
        }
        return minWord;
    }*/

    /*public static String mostCountedWord(String input) {
        //Napisz metod, który będzie szukać najbardziej powtarzalna słowo w nadchodzącym strigie

        String[] words = input.split(" ");

        if (words.length == 0)
            return null;

        String mostCountWord = null;

        for (String word : words) {
            if (word.length() > 0 && checkWords(word)) {
                mostCountWord = word;
                break;
            }
        }

        int mostCounter = 0;

        for (String word : words) {
            int count = 0;
            for (String word1 : words) {
                if (word.equals(word1) && word.length() > 0 && checkWords(word1)) {
                    count++;
                }
            }
            if (count > mostCounter) {
                mostCounter = count;
                mostCountWord = word;
            }
        }


        return mostCountWord;
    }*/
}