package lesson30.task2;

import java.util.List;
import java.util.Set;

public class Controller {

    EmployeeDAO employeeDAO = new EmployeeDAO();
    ProjectDAO projectDAO = new ProjectDAO();

    public List<Employee> employeesByProject(String projectName) {
        return EmployeeDAO.employeesByProject(projectName);
    }

    public Set<Project> projectsByEmployee(Employee employee){
        return ProjectDAO.projectsByEmployee(employee);
    }

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }
}
