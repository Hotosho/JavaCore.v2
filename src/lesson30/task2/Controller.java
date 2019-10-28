package lesson30.task2;

import java.util.Set;

public class Controller {

    EmployeeDAO employeeDAO = new EmployeeDAO();
    ProjectDAO projectDAO = new ProjectDAO();

    public Set<Employee> employeesByProject(String projectName) {
        return EmployeeDAO.employeesByProject(projectName);
    }

    public Set<Project> projectsByEmployee(Employee employee){
        return ProjectDAO.projectsByEmployee(employee);
    }

    public Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType){
        return EmployeeDAO.employeesByDepartmentWithoutProject(departmentType);
    }

    public Set<Employee> employeesWithoutProject(){
        return EmployeeDAO.employeeWithoutTheProject();
    }

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }

}
