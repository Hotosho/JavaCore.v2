package lesson30.task2;

import java.util.Set;
import java.util.TreeSet;

public class FirmDAO {

    private static Set<Firm> firmsDAO = new TreeSet<>();

    public FirmDAO(TreeSet<Firm> firmsDAO) {
        this.firmsDAO = firmsDAO;
    }

    public static Set<Firm> getFirmsDAO() {
        return firmsDAO;
    }

    private static Firm firmAdd(Firm firm) {
        firmsDAO.add(firm);
        return firm;
    }

    private static Firm removeFirm(Firm firm) {

        firmsDAO.remove(firm);
        return firm;
    }
}
