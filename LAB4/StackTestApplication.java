import java.util.Scanner;

/**
 * A test application to interact with a GenericStack of integers.
 */
public class StackTestApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericStack<Integer> stack = new GenericStack<>();

        while (true) {
            System.out.print("Menu:\n1. Push\n2. Pop\n3. Peek\n4. Check if Empty\n5. Get Size\n");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println("Pushed " + value + " onto the stack.");
                    break;
                case 2:
                    try {
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        int top = stack.peek();
                        System.out.println("Top element: " + top);
                    } catch (IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    boolean empty = stack.isEmpty();
                    System.out.println("Stack is empty: " + empty);
                    break;
                case 5:
                    int size = stack.size();
                    System.out.println("Stack size: " + size);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }
}
