package lesson30.task2;

import java.util.*;

public class Department {
    private DepartmentType type;
    private Set<Department> employees;

    /*public Department(DepartmentType type, Set<Department> employees) {
        this.type = type;
        this.employees = employees;
    }*/

    public Department(DepartmentType developers, HashSet<Employee> dev) {

    }


    public Department(DepartmentType type) {
        this.type = type;
    }


    public DepartmentType getType() {
        return type;
    }

    public Set<Department> getEmployees() {
        return employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, employees);
    }

    @Override
    public String toString() {
        return "Department{" +
                "type=" + type +
                ", employees=" + employees +
                '}';
    }
}
