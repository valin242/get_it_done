import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task implements Serializable {
    private String title;
    private String description;
    private String deadline;
    private int priority;
    private LocalDate date;

    // method to get task information (class constructor)
    public List<Object> taskList(String title, String description, String deadline, int priority, LocalDate date) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.date = date;
        List<Object> taskList = new ArrayList<>();


        return taskList;
    }

    // Create getters and setters for each of the attributes
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
    
    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public void setDeadline(String deadline) {
    //     this.deadline = deadline;
    // }

    // public void setPriority(int priority) {
    //     this.priority = priority;
    // }

}
