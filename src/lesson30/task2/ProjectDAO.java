package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class ProjectDAO {

    private static Set<Project> projectsDAO = new HashSet<>();

    public ProjectDAO(HashSet<Project> projectsDAO) {
        this.projectsDAO = projectsDAO;
    }

    // ИДЕЯ сказала надо создать 2й контруктор строка 15,16
    public ProjectDAO() {
        projectsDAO = new HashSet<>();
    }

    public static Set<Project> getProjectsDAO() {
        return projectsDAO;
    }

    private static Project addProject(Project project) {
        projectsDAO.add(project);
        return project;
    }

    private static Project removeProject(Project project) {
        projectsDAO.remove(project);
        return project;
    }


    public static Project getNameProject(String name) {
        if (projectsDAO == null)
            return null;

        for (Project pr : projectsDAO) {
            if (pr != null && pr.getName().equals(name))
                return pr;
        }
        return null;
    }

    // тут ИДЕЯ написала мне ошибку потом предложила добавить конструкцию строка 49
    public HashSet<Project> projectsByEmployee(Employee employee){

        HashSet<Project> hashProjectsByEmployee = new HashSet<>();

        hashProjectsByEmployee = (HashSet<Project>) employee.getProjects();
        return hashProjectsByEmployee;
    }

}
