package za.ac.cput.Shaheed;

import java.time.LocalDate;
import java.util.Objects;

public class List{

    private int taskId;
    private String taskName;
    private LocalDate dateCreated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return taskId == list.taskId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }

    public List(String taskName, int taskId) {
            this.taskName = taskName;
            this.taskId = taskId;
        }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "List{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
