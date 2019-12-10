package lesson32.Homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public void readNumbers() throws IOException {
        System.out.println("Please enter ten number: ");

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);

        int countErrors = 3;
        int sum = 0;
        int tryEnter = 10;

        while (countErrors > 0) {
            while (tryEnter > 0) {

                String numbers = bf.readLine();

                if (checkNumbers(numbers)) {
                    String[] arrayNumbers = numbers.split(" ");

                    if (arrayNumbers.length > 10)
                        break;

                    for (String str : arrayNumbers) {
                        int x = Integer.parseInt(str);
                        sum += x;
                    }
                    System.out.println("Sum your numbers +" + sum);
                }

                if (!checkNumbers(numbers)) {
                    countErrors--;
                    if (countErrors == 0) {
                        System.out.println("Your numbers are wrong. You have" + countErrors + "attempts to try again");
                    } else {
                        System.out.println("Your numbers are wrong. Number of attempts exceeded");
                    }
                }
                tryEnter--;
                if (tryEnter == 0){
                    System.out.println("maximum number of digits entered");
                    break;
                }
            }
        }

    }


    private boolean checkNumbers(String input) {
        String[] arrayNumbers = input.split(" ");

        if (arrayNumbers.length > 10)
            return false;

        for (String str : arrayNumbers) {
            for (char ch : str.toCharArray()) {
                if (!Character.isDigit(ch))
                    return false;
            }

            int maxNumber = Integer.parseInt(str);
            if (maxNumber > 100)
                return false;
        }
        return true;
    }

}
