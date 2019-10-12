package lesson28;

import java.util.Comparator;

public class FullComparator implements Comparator<Capability> {
    DateComparator dateComparator = new DateComparator();

    @Override
    public int compare(Capability o1, Capability o2) {
        System.out.println("FullComparator is used");
        if (o1.getChannelName().compareTo(o2.getChannelName()) == 0)
            return 0;
        else if (o1.getChannelName().compareTo(o2.getChannelName()) < 0)
            return -1;
        else if (o1.getChannelName().compareTo(o2.getChannelName()) > 0)
            return 1;
        else if (o1.getFingerprint().compareTo(o2.getFingerprint()) == 0)
            return 0;
        else if (o1.getFingerprint().compareTo(o2.getFingerprint()) < 0)
            return -1;
        return 1;

    }


}
