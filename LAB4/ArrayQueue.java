public class ArrayQueue<T> {
    private int maxSize;
    private T[] queueArray;
    private int front;
    private int rear;
    private int n;

    /**
     * Constructs an empty queue with the given maximum size.
     *
     * @param size The maximum size of the queue.
     */
    public ArrayQueue(int size) {
        maxSize = size;
        queueArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        n = 0;
    }

    /**
     * Inserts a value at the rear of the queue.
     *
     * @param value The value to be inserted.
     */
    public void insert(T value) {
        if (rear == maxSize - 1) {
            rear = -1;  // Wrap around
        }
        queueArray[++rear] = value;
        n++;
    }

    /**
     * Removes and returns the value at the front of the queue.
     *
     * @return The value at the front of the queue.
     */
    public T remove() {
        T temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;  // Wrap around
        }
        n--;
        return temp;
    }

    /**
     * Retrieves the value at the front of the queue without removing it.
     *
     * @return The value at the front of the queue.
     */
    public T peekFront() {
        return queueArray[front];
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (n == 0);
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full, false otherwise.
     */
    public boolean isFull() {
        return (n == maxSize);
    }

    /**
     * Gets the current number of items in the queue.
     *
     * @return The number of items in the queue.
     */
    public int size() {
        return n;
    }
}
