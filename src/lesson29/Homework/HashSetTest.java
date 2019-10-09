package lesson29.Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        System.out.println(useHashSet());
    }

    public static Set<Order> useHashSet(){

        Order order1 = new Order(100, 1000, "zloty", "karta", "pl");
        Order order2 = new Order(200, 2000, "dollar", "green", "usa");
        Order order3 = new Order(300, 3000, "grywnia", "lapa", "ua");
        Order order4 = new Order(400, 4000, "euro", "piwo", "de");
        Order order5 = new Order(500, 5000, "funt", "manchester", "uk");

        Set<Order> orderSet = new HashSet<Order>();

        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);

        orderSet.remove(order1);

        Set<Order> orderSet1 = new HashSet<Order>();
        orderSet1.add(order5);
        orderSet1.add(order4);
        orderSet1.add(order3);
        orderSet.retainAll(orderSet1);
        System.out.println(orderSet + " orderSet after method retainAll");

        Object[] arr = orderSet.toArray();

        orderSet.add(order2);
        orderSet.add(order1);

        Iterator<Order> orderIterator = orderSet.iterator();
        System.out.println("The iterator worked: ");
        while (orderIterator.hasNext())
            System.out.println(orderIterator.next());

        System.out.println(orderSet.size() + " orderSet size");
        return orderSet;
    }
}
