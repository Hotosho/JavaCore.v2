package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    private static Set<Employee> employees;

    public EmployeeDAO(Set<Employee> employees) {
        EmployeeDAO.employees = new HashSet<>();
    }

    public static Set<Employee> getEmployees() {
        return employees;
    }

    private static Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    private static Employee removeEmployee(Employee employee) {
        employees.remove(employee);
        return employee;
    }

    //список сотрудников, работающих над заданным проектом
    public static Set<Employee> employeesByProject(String projectName) {
        HashSet<Employee> listEmployeesByProject = new HashSet<>();

        for (Employee em : employees) {
            if (em != null && em.getProjects() != null && em.getProjects().contains(ProjectDAO.getNameProject(projectName)))
                ;
            listEmployeesByProject.add(em);
        }
        return listEmployeesByProject;
    }

    //TODO
    // если я правильно понял, если в метод есть вложенный метод, то все два метода должны иметь одну и туже структуру данных?
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

    //TODO
    // 1й способ
    public static Set<Employee> employeesByTeamLead(Employee lead) {
        HashSet<Employee> listEmployeesByTeamLead = new HashSet<>();


        for (Project pr : lead.getProjects())
    }


    //TODO
    // 2 способ
    //список подчиненных для заданного руководителя (по всем проектам, которыми он руководит)
   /* public static Set<Employee> employeesByTeamLead(Employee lead, String projectName) {
        HashSet<Employee>listEmployeesByTeamLead = new HashSet<>();

        for (Employee teamLead : employeesInTeamLead()){
            for (Employee em : employeesByProject(projectName)){
                if (em.getPosition() != Position.TEAM_LEAD)
                    listEmployeesByTeamLead.add(em);
            }
        }
        return listEmployeesByTeamLead;
    }

    // список Тимлидеров
    public static Set<Employee> employeesInTeamLead() {
        HashSet<Employee> listEmployeeNotTeamLead = new HashSet<>();
        for (Employee em : getEmployees()) {
            if (em != null && em.getPosition().equals(Position.TEAM_LEAD)) {
                listEmployeeNotTeamLead.add(em);
            }
        }
        return listEmployeeNotTeamLead;
    }*/


}
