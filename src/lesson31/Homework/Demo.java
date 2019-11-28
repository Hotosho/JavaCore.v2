package lesson31.Homework;

public class Demo {
    public static void main(String[] args) throws Exception {

        String symbols = "Pineapple";
        String text = "Jony Ive has left Apple Apple";
        String text1 = "A";

        Solution solution = new Solution();
        System.out.println(solution.countSymbols(symbols));
        System.out.println(solution.words(text));
        System.out.println(solution.words(text1));

    }
}
