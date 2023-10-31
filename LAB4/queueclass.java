public class queueclass {
    public static void main(String[] args) {
        ArrayQueue<Character> queue = new ArrayQueue<>(5);

        // Insert elements into the queue
        queue.insert('A');
        queue.insert('B');
        queue.insert('C');

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Check if the queue is full
        System.out.println("Is the queue full? " + queue.isFull());

        // Get the front element without removing it
        System.out.println("Front element: " + queue.peekFront());

        // Remove elements from the queue and display them
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.remove());
        }

        // Check if the queue is empty again
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
