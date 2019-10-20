package lesson30.task2;

import java.util.ArrayList;
import java.util.HashSet;

public class Controller {

    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private ProjectDAO projectDAO = new ProjectDAO();

    public ArrayList<Employee> employeesByProject(String projectName) {
        return employeeDAO.employeesByProject(projectName);
    }

    public HashSet<Project> projectsByEmployee(Employee employee) {
        return projectDAO.projectsByEmployee(employee);

    }


}
