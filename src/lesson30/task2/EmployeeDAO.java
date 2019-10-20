package lesson30.task2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private static List<Employee> employeesDAO = new ArrayList<>();

    public EmployeeDAO(ArrayList<Employee> employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

    public EmployeeDAO() {
        employeesDAO = new ArrayList<>();
    }


    public static List<Employee> getEmployeesDAO() {
        return employeesDAO;
    }

    private static Employee addEmployee(Employee employee) {
        employeesDAO.add(employee);
        return employeesDAO.get(employeesDAO.indexOf(employee));
    }

    private static Employee removeEmployee(Employee employee) {
        return employeesDAO.remove(employeesDAO.indexOf(employee));
    }

    //список сотрудников, работающих над заданным проектом
    public ArrayList<Employee> employeesByProject(String projectName) {

        ArrayList<Employee> listEmployeesByProject = new ArrayList<>();

        for (Employee em : getEmployeesDAO()) {
            if (em != null && em.getProjects() != null && em.getProjects().contains(ProjectDAO.getNameProject(projectName)))
                listEmployeesByProject.add(em);
        }
        return listEmployeesByProject;
    }

}
