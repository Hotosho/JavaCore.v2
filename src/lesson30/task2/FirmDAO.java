package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class FirmDAO {
    private static Set<Firm> firms;

    public FirmDAO(Set<Firm> firms) {
        FirmDAO.firms = new HashSet<>();
    }

    public static Set<Firm> getFirms() {
        return firms;
    }

    private Firm addFirm(Firm firm){
        firms.add(firm);
        return firm;
    }

    private Firm removeFirm(Firm firm){
        firms.remove(firm);
        return firm;
    }
}
