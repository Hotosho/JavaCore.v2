package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    private static Set<Employee> employees;

    public EmployeeDAO(Set<Employee> employees) {
        EmployeeDAO.employees = new HashSet<>();
    }

    public EmployeeDAO() {

    }

    public static Set<Employee> getEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee removeEmployee(Employee employee) {
        employees.remove(employee);
        return employee;
    }

    //список сотрудников, работающих над заданным проектом
    public static Set<Employee> employeesByProject(String projectName) {
        HashSet<Employee> listEmployeesByProject = new HashSet<>();

        for (Employee em : employees) {
            if (em != null && em.getProjects() != null && em.getProjects().contains(ProjectDAO.getNameProject(projectName)));
            listEmployeesByProject.add(em);
        }
        return listEmployeesByProject;
    }


    //список сотрудников из заданного отдела, не участвующих ни в одном проекте
    public static Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {
        Set<Employee> listEmployeesByDepartmentWithoutProject = new HashSet<>();

        for (Employee em : employeeWithoutTheProject()) {
            if (em.getDepartment().getType() == departmentType)
                listEmployeesByDepartmentWithoutProject.add(em);
        }
        return listEmployeesByDepartmentWithoutProject;
    }

    //список сотрудников, не участвующих ни в одном проекте
    public static Set<Employee> employeeWithoutTheProject() {
        HashSet<Employee> listEmployeeWithoutTheProject = new HashSet<>();
        for (Employee em : getEmployees()) {
            if (em != null && em.getProjects() != null && em.getProjects().isEmpty())
                listEmployeeWithoutTheProject.add(em);
            return listEmployeeWithoutTheProject;
        }
        return null;
    }

    //список подчиненных для заданного руководителя (по всем проектам, которыми он руководит)
    public static Set<Employee> employeesByTeamLead(Employee lead) {
        HashSet<Employee> listEmployeesByTeamLead = new HashSet<>();

        for (Project leadProject : lead.getProjects()){
            listEmployeesByTeamLead.addAll(employeesByProject(leadProject.getName()));
        }
        return listEmployeesByTeamLead;
    }

    //список руководителей для заданного сотрудника (по всем проектам, в которых он участвует)
    public static Set<Employee> teamLeadsByEmployee(Employee employee){
        HashSet<Employee> listTeamLeadsByEmployee = new HashSet<>();

        for (Project employeeProject : employee.getProjects()){
            listTeamLeadsByEmployee.addAll(employeesByProject(employeeProject.getName()));
        }
        return listTeamLeadsByEmployee;
    }

    //список сотрудников, участвующих в тех же проектах, что и заданный сотрудник
    public static Set<Employee> employeesByProjectEmployee(Employee employee){
        ProjectDAO projectDAO = new ProjectDAO();
        HashSet<Employee> listEmployeesByProjectEmployee = new HashSet<>();

        for (Project emProject : projectDAO.projectsByEmployee(employee)){
            listEmployeesByProjectEmployee.addAll(employeesByProject(emProject.getName()));
        }
        return listEmployeesByProjectEmployee;
    }

    //список сотрудников, участвующих в проектах, выполняемых для заданного заказчика
    public static Set<Employee> employeesByCustomerProjects(Customer customer){
        HashSet<Employee> listEmployeesByCustomerProjects = new HashSet<>();

        for (Project pr : ProjectDAO.getProjects()){
            if (pr != null && pr.getCustomer().equals(customer)){
                listEmployeesByCustomerProjects.addAll(employeesByProject(pr.getName()));
            }
        }
        return listEmployeesByCustomerProjects;
    }

}
