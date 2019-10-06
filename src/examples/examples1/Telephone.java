package examples.examples1;

public interface Telephone {

    void callTo(String name);
    default void callToMom(){
        System.out.println("I am calling to my mom!");
    }

    static String getMyNumber(){
        return "+48 909 901 928";
    }
}
