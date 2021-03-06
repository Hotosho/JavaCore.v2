package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    private static Set<Employee> employees;


    public EmployeeDAO() {
        employees = new HashSet<>();
    }

    public static Set<Employee> getEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        try {
            employees.add(employee);
        } catch (Exception e) {
            System.out.println("Employee is not transmitted");
        }
        return employee;
    }

    public Employee removeEmployee(Employee employee) {
        employees.remove(employee);
        return employee;
    }

    //1- список сотрудников, работающих над заданным проектом+++
    public static Set<Employee> employeesByProject(String projectName) {
        HashSet<Employee> employeesByProject = new HashSet<>();
        for (Employee em : employees) {
            for (Project pr : em.getProjects()) {
                if (pr != null && projectName.equals(pr.getName())) {
                    employeesByProject.add(em);
                    break;
                }
            }
        }
        return employeesByProject;
    }

    //2- список сотрудников из заданного отдела, не участвующих ни в одном проекте+++
    public static Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {
        Set<Employee> EmplDepartWithoutProject = new HashSet<>();

        for (Employee em : employeeWithoutTheProject()) {
            if (em.getDepartment().getType().equals(departmentType))
                EmplDepartWithoutProject.add(em);
        }
        return EmplDepartWithoutProject;
    }

    //4- список сотрудников, не участвующих ни в одном проекте+++
    public static Set<Employee> employeeWithoutTheProject() {
        HashSet<Employee> listEmployeeWithoutTheProject = new HashSet<>();
        for (Employee em : getEmployees()) {
            if (em != null && em.getProjects() != null && em.getProjects().isEmpty())
                listEmployeeWithoutTheProject.add(em);
        }
        return listEmployeeWithoutTheProject;
    }

    //5- список подчиненных для заданного руководителя (по всем проектам, которыми он руководит)+++
    public static Set<Employee> employeesByTeamLead(Employee lead) {
        HashSet<Employee> listEmployeesByTeamLead = new HashSet<>();

        for (Project leadProject : lead.getProjects()) {
            listEmployeesByTeamLead.addAll(employeesByProject(leadProject.getName()));
        }
        return listEmployeesByTeamLead;
    }


    // 6- список руководителей для заданного сотрудника (по всем проектам, в которых он участвует)+++
    public static Set<Employee> teamLeadsByEmployee(Employee employee) {
        HashSet<Employee> listTeamLeadsByEmployee = new HashSet<>();

        for (Employee em : employeesByProjectEmployee(employee)){
            if (em != null && em.getPosition().equals(Position.TEAM_LEAD))
                listTeamLeadsByEmployee.add(em);
        }
        return listTeamLeadsByEmployee;

    }


    // 7- список сотрудников, участвующих в тех же проектах, что и заданный сотрудник+++
    public static Set<Employee> employeesByProjectEmployee(Employee employee) {
        ProjectDAO projectDAO = new ProjectDAO();
        HashSet<Employee> listEmployeesByProjectEmployee = new HashSet<>();

        for (Project pr : projectDAO.projectsByEmployee(employee)) {
            listEmployeesByProjectEmployee.addAll(employeesByProject(pr.getName()));
        }
        return listEmployeesByProjectEmployee;
    }

    //8- список сотрудников, участвующих в проектах, выполняемых для заданного заказчика----
    public static Set<Employee> employeesByCustomerProjects(Customer customer) {
        HashSet<Employee> listEmployeesByCustomerProjects = new HashSet<>();

       for (Project pr : ProjectDAO.getProjects()){
           if (pr != null && pr.getCustomer().equals(customer))
               listEmployeesByCustomerProjects.addAll(employeesByProject(pr.getName()));
       }
       return listEmployeesByCustomerProjects;
    }

    //9- список проектов, выполняемых для заданного заказчика----
    public static Set<Project> projectsByCustomer(Customer customer){
        HashSet<Project> listProjectsByCustomer = new HashSet<>();

        for (Project pr : ProjectDAO.getProjects()){
            if (pr != null && pr.getCustomer().equals(customer))
                listProjectsByCustomer.add(pr);
        }
        return listProjectsByCustomer;
    }

}
