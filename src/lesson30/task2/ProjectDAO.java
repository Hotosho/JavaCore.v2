package lesson30.task2;


import java.util.HashSet;
import java.util.Set;


public class ProjectDAO {
    private static Set<Project> projects;

    public ProjectDAO(Set<Project> projects) {
        ProjectDAO.projects = new HashSet<>();
    }

    public Set<Project> getProjects() {
        return projects;
    }

    private Project addProject(Project project) {
        projects.add(project);
        return project;
    }

    private Project removeProject(Project project) {
        projects.remove(project);
        return project;
    }

    //список сотрудников, работающих над заданным проектом (достает имя проекта)
    public static Project getNameProject(String name) {
        if (projects == null)
            return null;
        for (Project pr : projects) {
            if (pr != null && pr.getName().equals(name))
                return pr;
        }
        return null;
    }

    //список проектов, в которых участвует заданный сотрудник
    public static Set<Project> projectsByEmployee(Employee employee) {
        HashSet<Project> listProjectsByEmployee;
        listProjectsByEmployee = (HashSet<Project>) employee.getProjects();
        return listProjectsByEmployee;
    }

}
