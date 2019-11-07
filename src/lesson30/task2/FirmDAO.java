package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class FirmDAO {
    private static Set<Firm> firms;

    public static void FirmDAO(Set<Firm> firms) {
        firms = new HashSet<>();
    }

    public static Set<Firm> getFirms() {
        return firms;
    }

    public  Firm addFirm(Firm firm) {
        firms.add(firm);
        return firm;
    }

    public  Firm removeFirm(Firm firm) {
        firms.remove(firm);
        return firm;
    }
}
