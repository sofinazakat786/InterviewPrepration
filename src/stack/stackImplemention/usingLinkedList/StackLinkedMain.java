package stack.stackImplemention.usingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackLinkedMain {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\n===== Stack Operations =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            // Get user choice
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }

            // Perform operations based on user choice
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    try {
                        int value = sc.nextInt();
                        stack.push(value);
                        System.out.println(value + " pushed to stack.");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter an integer.");
                        sc.next(); // Clear the invalid input
                    }
                    break;

                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        int topValue = stack.peek();
                        System.out.println("Top value: " + topValue);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Stack Elements: ");
                    stack.display();
                    break;

                case 5:
                    System.out.println("Current Stack Size: " + stack.size());
                    break;

                case 6:
                    System.out.println("Exiting... Thank you for using the Stack App!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option! Please select from the menu.");
            }

            // Pause and clear the screen for better UX (optional)
            System.out.print("\nPress Enter to continue...");
            sc.nextLine(); // Consume newline
            sc.nextLine(); // Wait for Enter
            clearConsole();
        }
    }

    // Clear console for better UX (works in most terminals)
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Could not clear console.");
        }
    }
}
