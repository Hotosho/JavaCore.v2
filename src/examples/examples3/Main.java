package examples.examples3;

public class Main {
    public static void main(String[] args) {

        Knight knight = new Knight();

        String txtForKnight = knight.hardQuest( new DeadIslandQuest());
        System.out.println(txtForKnight);
    }
}
