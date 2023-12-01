import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getDeadline());
        }
    }

    public void deleteTask() {

    }

    public void editTaskDeadline() {

    }


}
