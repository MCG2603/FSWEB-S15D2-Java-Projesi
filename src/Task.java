import java.util.Objects;

public class Task {
    public String project ;
    public String description;
    public String assignee ;
    public Enum priority;
    public Enum  status;

    public Task() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }
}
