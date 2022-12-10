import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


                Scanner input = new Scanner(System.in);
                ArrayList<String> taskName = new ArrayList<>();
                ArrayList<String> taskDate = new ArrayList<>();
                ArrayList<String> taskStatus = new ArrayList<>();
                ArrayList<String> taskDescription = new ArrayList<>();


                for (;;) {

                System.out.println("1. Add a task");
                System.out.println("2. Mark a task as done");
                System.out.println("3. Remove a task");
                System.out.println("4. Edit a task");
                System.out.println("5. Display all tasks");
                System.out.println("6. exit");
                int option = input.nextInt();
                input.nextLine();


                switch (option) {
                    case 1:
                        System.out.print("Please insert the task name: ");
                        taskName.add(input.nextLine());

                        System.out.print("Please insert the due date for this task: ");
                        taskDate.add(input.nextLine());

                        taskStatus.add("incomplete");

                        System.out.print("Please insert a description of the task: ");
                        taskDescription.add(input.nextLine());

                        System.out.println("Task successfully added");
                        System.out.println();

                        break;
                    case 2:
                        if (taskName.isEmpty()){
                            System.out.println("No tasks found, please add task first");
                            System.out.println();
                        } else {
                            System.out.print("Select the number of the task you would like to mark as complete: ");
                            int mark = (input.nextInt() - 1);

                            taskStatus.set(mark, "complete");

                            System.out.println("Task marked as complete");
                            System.out.println();
                        }

                        break;
                    case 3:
                        if (taskName.isEmpty()){
                            System.out.println("No tasks found, please add task first");
                            System.out.println();
                        } else {
                            System.out.println("Select the number of the task you would like to delete: ");
                            int delete = (input.nextInt() - 1);

                            taskName.remove(delete);
                            taskDate.remove(delete);
                            taskStatus.remove(delete);
                            taskDescription.remove(delete);

                            System.out.println("Task deleted");
                            System.out.println();
                        }

                        break;
                    case 4:
                        if (taskName.isEmpty()){
                            System.out.println("No tasks found, please add task first");
                            System.out.println();
                        } else {
                            System.out.println("Select the number of the task you would like to edit: ");
                            int edit = (input.nextInt() - 1);
                            input.nextLine();

                            System.out.println("Would you like to edit the name, date, or description: ");
                            String editType = input.nextLine();


                            switch (editType) {
                                case "name":
                                    System.out.println("Enter new name: ");
                                    taskName.set(edit, input.nextLine());

                                    System.out.println("Task edited");

                                    break;
                                case "date":
                                    System.out.println("Enter new date: ");
                                    taskDate.set(edit, input.nextLine());

                                    System.out.println("Task edited");

                                    break;
                                case "description":
                                    System.out.println("Enter new description: ");
                                    taskDescription.set(edit, input.nextLine());

                                    System.out.println("Task edited");

                                    break;
                                default:
                                    System.out.println("Invalid option, please retry");
                            }
                            System.out.println();
                        }

                        break;
                    case 5:
                        if (taskName.isEmpty()){
                            System.out.println("No tasks found, please add task first");
                            System.out.println();
                        } else {
                            System.out.println();

                            for (int i = 0; i < taskName.size(); i++) {
                                System.out.println("Task " + (i + 1) + ": " + taskName.get(i) + ", due " + taskDate.get(i) + ", '" + taskDescription.get(i) + "' STATUS: " + taskStatus.get(i) + ".");
                                System.out.println();
                            }
                            System.out.println();
                        }

                        break;
                    case 6:

                        System.out.print("If you exit your tasks will not be saved, proceed? y|n: ");
                        String exit = input.nextLine();
                        exit = exit.toLowerCase();

                        switch(exit) {
                            case "y":
                            case "yes":
                                return;

                            case "n":
                            case "no":
                        }
                        break;
                    default:
                        System.out.println("Invalid option, please retry");
                        System.out.println();
                }
            }
        } catch(Exception e) {
            System.out.println("ERROR: ARRAY VALUE NONEXISTENT");
        }
    }
}