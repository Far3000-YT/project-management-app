package base;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final String name;
    private final List<Employee> employees;
    private final List<Project> projects;


    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.projects = new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }


    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }


    public List<Employee> getEmployees() {
        return employees;
    }


    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
        }
    }


    public void removeProject(Project project) {
        projects.remove(project);
    }


    public List<Project> getProjects() {
        return projects;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees.size() +
                ", projects=" + projects.size() +
                '}';
    }
}

