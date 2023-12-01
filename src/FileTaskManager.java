import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileTaskManager {
    private String fileName;

    public FileTaskManager(String fileName) {
        this.fileName = fileName;
    }

    public void saveTasks(List<Task> tasks) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Task> loadTasks() {
        List<Task> tasks = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            tasks = (List<Task>) ois.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}
