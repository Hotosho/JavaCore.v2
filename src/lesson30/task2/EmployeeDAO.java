package lesson30.task2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private static List<Employee> employeesDAO = new ArrayList<>();

    private static Employee addEmployee(Employee employee) {
        employeesDAO.add(employee);
        return employeesDAO.get(employeesDAO.indexOf(employee));
    }

    private static Employee removeEmployee(Employee employee) {
        return employeesDAO.remove(employeesDAO.indexOf(employee));
    }
}
