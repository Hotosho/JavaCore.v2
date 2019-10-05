package lesson28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class DemoComparator {
    public static void main(String[] args) {

        Capability capability2 = new Capability(1005, "aest", "rrrr", false, new Date(2000,8,19));
        Capability capability4 = new Capability(900, "best", "rrrr", false, new Date(1995,5,21));
        Capability capability1 = new Capability(1001, "west", "rrrr", true, new Date(1996,9,23));
        Capability capability3 = new Capability(900, "dest", "rrrr", true, new Date(1994,4,4));

        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        System.out.println(capabilities);

        capabilities.sort(new IsActiveComparator());

        System.out.println(capabilities);

        Comparator<Capability> comparator = new Comparator<Capability>() {
            @Override
            public int compare(Capability o1, Capability o2) {

                //если поле channelName не равно - сравнию по нему +
                //если равно - перехожу к fingerprint
                //если fingerprint не равно - сравнию по нему
                //если равно - перехожу к dateCreated
                //если dateCreated не равно -сравниваю по нему
                // если равно - обекти равно ( вернуть ноль)


                if (!o1.getChannelName().equals(o2.getChannelName()))
                    return o1.getChannelName().compareTo(o2.getChannelName());
                return 0;
            }
        };

        capabilities.sort(new DateComparator());
        System.out.println(capabilities);

        capabilities.sort(new FullComparator());
        System.out.println(capabilities);
    }
}
