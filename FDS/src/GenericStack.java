/**
 * A generic stack implementation that can store elements of any type.
 *
 * @param <T> The type of elements to be stored in the stack.
 */
public class GenericStack<T> {
    private Object[] stack;
    private int size;
    private static int cap = 10;

    /**
     * Constructs an empty stack with the default capacity.
     */
    public GenericStack() {
        stack = new Object[cap];
        size = 0;
    }

    /**
     * Push an element onto the stack.
     *
     * @param item The element to be pushed onto the stack.
     */
    public void push(T item) {
        Capacity();
        stack[size++] = item;
    }

    /**
     * Pop and return the top element from the stack.
     *
     * @return The top element of the stack.
     * @throws IllegalStateException if the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = (T) stack[--size];
        return item;
    }

    /**
     * Get the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws IllegalStateException if the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) stack[size - 1];
    }

    /**
     * Check if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Get the size of the stack.
     *
     * @return The size of the stack.
     */
    public int size() {
        return size;
    }

    /**
     * Ensure that the array has enough capacity.
     */
    private void Capacity() {
        if (size == stack.length) {
            int newCapacity = stack.length * 2;
            stack = java.util.Arrays.copyOf(stack, newCapacity);
        }
    }

}


