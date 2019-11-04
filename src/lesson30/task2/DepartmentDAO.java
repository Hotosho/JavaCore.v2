package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class DepartmentDAO {
    private static Set<Department> departments;

    public DepartmentDAO(Set<Department> departments) {
        DepartmentDAO.departments = new HashSet<>();
    }

    public DepartmentDAO() {

    }

    public static Set<Department> getDepartments() {
        return departments;
    }

    public Department addDepartment(Department department){
        departments.add(department);
        return department;
    }

    public Department removeDepartment(Department department){
        departments.remove(department);
        return department;
    }
}
