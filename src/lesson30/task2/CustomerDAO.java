package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class CustomerDAO {
    private static Set<Customer> customers;

    public CustomerDAO(Set<Customer> customers) {
        CustomerDAO.customers = new HashSet<>();
    }

    public CustomerDAO() {

    }

    public static Set<Customer> getCustomers() {
        return customers;
    }


    public  Customer addCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer removeCustomer(Customer customer) {
        customers.remove(customer);
        return customer;
    }
}
