package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class FirmDAO {
    private static Set<Firm> firms;

    /*public FirmDAO(Set<Firm> firms) {
        this.firms = new HashSet<>();
    }*/

    public FirmDAO() {
        firms = new HashSet<>();
    }


    public  Firm addFirm(Firm firm) {
        try {
            firms.add(firm);
        }
        catch (Exception e){
            System.out.println("Firm is not transmitted");
        }
        return firm;
    }

    public  Firm removeFirm(Firm firm) {
        firms.remove(firm);
        return firm;
    }

    public static Set<Firm> getFirms() {
        return firms;
    }
}
