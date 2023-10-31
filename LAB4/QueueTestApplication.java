import java.util.Scanner;

/**
 * A test application to interact with a generic ArrayQueue.
 */
public class QueueTestApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();

        ArrayQueue<Long> queue = new ArrayQueue<>(size);

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue (Insert an element)");
            System.out.println("2. Dequeue (Remove an element)");
            System.out.println("3. Peek (View the front element)");
            System.out.println("4. Check if the queue is empty");
            System.out.println("5. Check if the queue is full");
            System.out.println("6. Get the current size of the queue");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full. Cannot enqueue.");
                    } else {
                        System.out.print("Enter the element to enqueue: ");
                        long element = sc.nextLong();
                        queue.insert(element);
                        System.out.println("Enqueued: " + element);
                    }
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    } else {
                        long dequeuedElement = queue.remove();
                        System.out.println("Dequeued: " + dequeuedElement);
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. Nothing to peek.");
                    } else {
                        long frontElement = queue.peekFront();
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    System.out.println("Queue is empty: " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue is full: " + queue.isFull());
                    break;
                case 6:
                    System.out.println("Current size of the queue: " + queue.size());
                    break;
                case 7:
                    System.out.println("Exiting the Queue Test Application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
