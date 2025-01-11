package base;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final int id;
    private final String name;
    private List<Project> projects;

    public Employee (int id, String name) {
        this.id = id;
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
        }
    }

    public void removeProject(Project project) {
        if (projects.contains(project)) {
            projects.remove(project);
        }
    }

}

