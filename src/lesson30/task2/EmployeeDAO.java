package lesson30.task2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private static List<Employee> employees;

    public EmployeeDAO(List<Employee> employees) {
        EmployeeDAO.employees = new ArrayList<>();
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    private static Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employees.get(employees.indexOf(employee));
    }

    private static Employee removeEmployee(Employee employee) {
        return employees.remove(employees.indexOf(employee));
    }

    public static List<Employee> employeesByProject(String projectName) {
        ArrayList<Employee> listEmployeesByProject = new ArrayList<>();

        for (Employee em : employees) {
            if (em != null && em.getProjects() != null && em.getProjects().contains(ProjectDAO.getNameProject(projectName)))
                ;
            listEmployeesByProject.add(em);
        }
        return listEmployeesByProject;
    }

    //TODO
    public static List<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {
        ArrayList<Employee> listEmployeesByDepartmentWithoutProject = new ArrayList<>();


        for (Employee em : employeeWithoutProject()){

        }
    }

    private static Employee employeeWithoutProject(){
        for (Employee em : getEmployees()) {
            if (em != null && em.getProjects() != null && em.getProjects().isEmpty())
                return em;
        }
        return null;
    }
}
