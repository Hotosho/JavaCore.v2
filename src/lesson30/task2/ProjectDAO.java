package lesson30.task2;

import java.util.HashSet;
import java.util.Set;

public class ProjectDAO {

    private static Set<Project> projectsDAO = new HashSet<>();

    private static Project addProject(Project project){
        projectsDAO.add(project);
        return project;
    }

    private static Project removeProject(Project project){
        projectsDAO.remove(project);
        return project;
    }
}
