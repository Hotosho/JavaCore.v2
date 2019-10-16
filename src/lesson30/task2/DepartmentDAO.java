package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class DepartmentDAO {

    private static Set<Department> departmentsDAO = new HashSet<>();

    private static Department addDepartment(Department department) {
        departmentsDAO.add(department);
        return department;
    }

    private static Department removeDepartment(Department department){
        departmentsDAO.remove(department);
        return department;
    }
}
