package base;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<Project> projects;

    //constructeur
    public Employee (int id, String name) {
        this.id = id;
        this.name = name;
        this.projects = new ArrayList<>();
    }

    //getter
    public int getid() {
        return id;
    }

    public String getname(){
        return name;
    }

    public List<Project> getProjects() {
        return new ArrayList<>(projects);
    }

    // Ajouter un projet
    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
    }

}

