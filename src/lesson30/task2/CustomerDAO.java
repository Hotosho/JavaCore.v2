package lesson30.task2;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private static List<Customer> customersDAO = new ArrayList<>();

    private static Customer addCustomer(Customer customer) {
        customersDAO.add(customer);
        return customersDAO.get(customersDAO.indexOf(customer));
    }

    private static Customer removeCustomer(Customer customer) {
        return customersDAO.remove(customersDAO.indexOf(customer));
    }

    //TODO
    /*как правильно написать set для обновления ?
    private static Customer updateCustomer(Customer customer) {

        //если в такой set надо дать два значения ?
        customersDAO.set(, Customer);
    }*/

    public static List<Customer> getCustomersDAO() {
        return customersDAO;
    }
}
