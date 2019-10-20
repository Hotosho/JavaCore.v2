package lesson30.task2;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    //1  вызов нужной структуры данных
    private List<Customer> customersDAO = new ArrayList<>();

    //2 конструктор которы принимает эту структуру данных в дао
    public CustomerDAO(ArrayList<Customer> customersDAO) {
        this.customersDAO = customersDAO;

    }
    //3 методы (создать/ удалить)
    private Customer addCustomer(Customer customer) {
        customersDAO.add(customer);
        return customersDAO.get(customersDAO.indexOf(customer));
    }

    private Customer removeCustomer(Customer customer) {
        return customersDAO.remove(customersDAO.indexOf(customer));
    }

    public List<Customer> getCustomersDAO() {
        return customersDAO;
    }
}
