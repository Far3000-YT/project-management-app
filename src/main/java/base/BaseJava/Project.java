package base.BaseJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
    private final int id;
    private final String name;
    private final String description;
    private final Date deadline;
    private Map<Employee, String> members;
    private List<Task> tasks;

    public Project (int id, String name, String description, Date deadline) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.members = new HashMap<>();
        this.tasks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Map<Employee, String> getMembers() {
        return members;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addMember(Employee employee, String role) {
        if (!members.containsKey(employee)) {
            members.put(employee, role);
            employee.addProject(this);
        }
    }

    public void removeMember(Employee employee) {
        if (members.containsKey(employee)) {
            members.remove(employee);
            employee.removeProject(this);
        }
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
    
    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", members=" + members +
                ", tasks=" + tasks +
                '}';
    }
}