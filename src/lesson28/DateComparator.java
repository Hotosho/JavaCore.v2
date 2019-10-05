package lesson28;

import java.util.Comparator;

public class DateComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        System.out.println("DataComparator is used");

        if (o1.getDateCreated().compareTo(o2.getDateCreated()) == 0) {
            return 0;
        } else if (o1.getDateCreated().compareTo(o2.getDateCreated()) < 0)
            return 1;
        else return -1;
    }
}
