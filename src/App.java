import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("\t1. Add Task");
            System.out.println("\t2. List Task");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Title of your tasks:");
                    String title = scanner.nextLine();

                    System.out.println("Description of your tasks:");
                    String description = scanner.nextLine();

                    System.out.println("Deadline of your tasks:");
                    String deadline = scanner.nextLine();

                    System.out.println("Priority of your tasks:");
                    int priority = scanner.nextInt();

                    LocalDate date = LocalDate.now();

                    Task taskDesc = new Task(title, description, deadline, priority, date);
                    System.out.println(taskDesc.getDate());

                    taskManager.addTask(taskDesc);
                     break;
                case 2:
                    taskManager.listTasks();
                    break;

                default:
                    System.out.println("Invalid choice. Try again");
            } scanner.close();

        } 
    }
}
