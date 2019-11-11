package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class CustomerDAO {
    private static Set<Customer> customers;

    /*public static void CustomerDAO(Set<Customer> customers) {
        customers = new HashSet<>();
    }*/

    public CustomerDAO() {
        customers = new HashSet<>();
    }

    public static Set<Customer> getCustomers() {
        return customers;
    }

    public Customer addCustomer(Customer customer){
        try {
            customers.add(customer);
        } catch (Exception e){
            System.out.println("Customer is not transmitted");
        }
        return customer;
    }

    public Customer removeCustomer(Customer customer) {
        customers.remove(customer);
        return customer;
    }
}
