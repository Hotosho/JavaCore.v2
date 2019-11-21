package lesson30.task2;

import java.util.Set;

public class Controller {

    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private ProjectDAO projectDAO = new ProjectDAO();
    private FirmDAO firmDAO = new FirmDAO();
    private CustomerDAO customerDAO = new CustomerDAO();
    private DepartmentDAO departmentDAO = new DepartmentDAO();


    public Set<Employee> employeesByProject(String projectName) {
        return EmployeeDAO.employeesByProject(projectName);
    }

    public Set<Project> projectsByEmployee(Employee employee) {
        return ProjectDAO.projectsByEmployee(employee);
    }

    public Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {

            return EmployeeDAO.employeesByDepartmentWithoutProject(departmentType);
    }

    public Set<Employee> employeesWithoutProject() {
        return EmployeeDAO.employeeWithoutTheProject();
    }

    public Set<Employee> employeesByTeamLead(Employee lead) {
        return EmployeeDAO.employeesByTeamLead(lead);
    }

    public Set<Employee> teamLeadsByEmployee(Employee employee) {
        return EmployeeDAO.teamLeadsByEmployee(employee);
    }

    public Set<Employee> employeesByProjectEmployee(Employee employee) {
        return EmployeeDAO.employeesByProjectEmployee(employee);
    }

    public Set<Employee> employeesByCustomerProjects(Customer customer) {
        return EmployeeDAO.employeesByCustomerProjects(customer);
    }

    public Set<Project> projectsByCustomer(Customer customer) {
        return EmployeeDAO.projectsByCustomer(customer);
    }


    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }

    public FirmDAO getFirmDAO() {
        return firmDAO;
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    public DepartmentDAO getDepartmentDAO() {
        return departmentDAO;
    }
}
