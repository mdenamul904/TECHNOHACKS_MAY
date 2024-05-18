import java.util.ArrayList;
import java.util.Scanner;

public class ToDo_list {
    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nTo-Do List Menu:");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View Items");
        System.out.println("4. Exit");
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        toDoList.add(item);
        System.out.println("Item added.");
    }

    private static void removeItem(Scanner scanner) {
        System.out.print("Enter the index of the item to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
            System.out.println("Item removed.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void viewItems() {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
