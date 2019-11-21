package lesson30.task2;


import java.util.HashSet;
import java.util.Set;


public class ProjectDAO {
    private static Set<Project> projects;

    public ProjectDAO() {
        projects = new HashSet<>();
    }

    public static Set<Project> getProjects() {
        return projects;
    }


    public Project addProject(Project project) {
        try {
            projects.add(project);
        } catch (Exception e) {
            System.out.println("Project is not transmitted");
        }
        return project;
    }

    public Project removeProject(Project project) {
        projects.remove(project);
        return project;
    }

    //3- список проектов, в которых участвует заданный сотрудник+++
    public static Set<Project> projectsByEmployee(Employee employee) {
        Set<Project> listProjectsByEmployee = new HashSet<>();
        listProjectsByEmployee = employee.getProjects();
        return listProjectsByEmployee;
    }


}
