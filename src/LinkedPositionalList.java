import java.util.*;

/**
 * Define the Position interface
 */
interface Position<T> {
    /**
     * @return element stored at this position
     * @throws IllegalStateException if position is no longer valid
     */
    T getElement() throws IllegalStateException;
}

/**
 * Define the PositionalList interface for positional lists
 */
interface PositionalList<T> {

    /**
     * @return the number of elements in the list
     */
    int size();

    /**
     * @return true if the list is empty, otherwise false
     */
    boolean isEmpty();

    /**
     * @return the first Position in the list. Returns null if empty
     */
    Position<T> first();

    /**
     * @return the last Position in the list. Returns null if empty
     */
    Position<T> last();

    /**
     * @param p the Position which is referred
     * @return the Position immediately before Position p. Returns null if p is first
     * @throws IllegalArgumentException
     */
    Position<T> before(Position<T> p) throws IllegalArgumentException;

    /**
     * @param p the Position which is referred
     * @return the Position immediately after Position p. Returns null if p is last
     * @throws IllegalArgumentException
     */
    Position<T> after(Position<T> p) throws IllegalArgumentException;

    /**
     * @param item inserts element item at the front of the list
     * @return the new Position
     */
    Position<T> addFirst(T item);

    /**
     * @param item inserts element item at the back of the list
     * @return the new Position
     */
    Position<T> addLast(T item);

    /**
     * @param p the Position which is referred
     * @param item inserts element item immediately before Position p
     * @return the new Position
     * @throws IllegalArgumentException
     */
    Position<T> addBefore(Position<T> p, T item) throws IllegalArgumentException;

    /**
     * @param p the Position which is referred
     * @param item inserts element item immediately after Position p
     * @return the new Position
     * @throws IllegalArgumentException
     */
    Position<T> addAfter(Position<T> p, T item) throws IllegalArgumentException;

    /**
     * @param p the Position which is referred
     * @param item replaces the element stored at Position p with item
     * @return the replaced element
     * @throws IllegalArgumentException
     */
    T set(Position<T> p, T item) throws IllegalArgumentException;

    /**
     * @param p the Position which is referred
     * @return Removes & returns the element item stored at Position p
     * @throws IllegalArgumentException
     */
    T remove(Position<T> p) throws IllegalArgumentException;

    Iterable<Position<T>> positions();

    Iterator<T> iterator();
}

/**
 * Implementation a Node class to represent elements in the linked list
 */

/**
 * Implementation of positional list which is stored as a doubly linked list
 */
public class LinkedPositionalList<T> implements PositionalList<T> {
    class Node<T> implements Position<T> {
        private T item; // reference to the element stored at this node
        private Node<T> prev; // reference to the previous node in the list
        private Node<T> next; // reference to the next node in the list

        public Node(T item, Node<T> prev, Node<T> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        public T getElement() throws IllegalStateException {
            if (next == null) {
                // convention for a defunctioning node
                throw new IllegalStateException("Position is invalid");
            }
            return item;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setElement(T item) {
            this.item = item;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
    private Node<T> header; // header sentinel
    private Node<T> trailer; // trailer sentinel
    private int size = 0; // no. of elements in list

    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private Node<T> validate(Position<T> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) {
            throw new IllegalArgumentException("Invalid position");
        }
        Node<T> node = (Node<T>) p;
        if (node.getNext() == null) {
            throw new IllegalArgumentException("Position is no longer in the list.");
        }
        return node;
    }

    private Position<T> position(Node<T> node) {
        if (node == header || node == trailer) {
            return null;
        }
        return node;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<T> first() {
        return position(header.getNext());
    }

    public Position<T> last() {
        return position(trailer.getPrev());
    }

    public Position<T> before(Position<T> p) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return position(node.getPrev());
    }

    public Position<T> after(Position<T> p) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return position(node.getNext());
    }

    private Position<T> addBetween(T item, Node<T> predecessor, Node<T> successor) {
        Node<T> newest = new Node<>(item, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
        return newest;
    }

    public Position<T> addFirst(T item) {
        return addBetween(item, header, header.getNext());
    }

    public Position<T> addLast(T item) {
        return addBetween(item, trailer.getPrev(), trailer);
    }

    public Position<T> addBefore(Position<T> p, T item) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return addBetween(item, node.getPrev(), node);
    }

    public Position<T> addAfter(Position<T> p, T item) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return addBetween(item, node, node.getNext());
    }

    public T set(Position<T> p, T item) throws IllegalArgumentException {
        Node<T> node = validate(p);
        T previousItem = node.getElement();
        node.setElement(item);
        return previousItem;
    }

    public T remove(Position<T> p) throws IllegalArgumentException {
        Node<T> node = validate(p);
        Node<T> predecessor = node.getPrev();
        Node<T> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        T removedItem = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        return removedItem;
    }

    public Iterator<T> iterator() {
        // Implement the iterator() method to iterate through elements
        return new PositionalListIterator();
    }

    private class PositionalListIterator implements Iterator<T> {
        private Position<T> current = first();

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException("No more elements in the list");
            }
            T element = current.getElement();
            current = after(current);
            return element;
        }
    }

    public Iterable<Position<T>> positions() {
        return new PositionIterable();
    }

    private class PositionIterable implements Iterable<Position<T>> {
        public Iterator<Position<T>> iterator() {
            return new PositionIterator();
        }
    }

    private class PositionIterator implements Iterator<Position<T>> {
        private Position<T> current = first();

        public boolean hasNext() {
            return current != null;
        }

        public Position<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more positions in the list");
            }
            Position<T> position = current;
            current = after(current);
            return position;
        }
    }


    public static void main(String[] args) {
        PositionalList<Integer> list = new LinkedPositionalList<Integer>();

        Position<Integer> first = list.addFirst(1);
        Position<Integer> second = list.addAfter(first, 2);
        Position<Integer> third = list.addAfter(second, 3);

        System.out.println("Elements in the list:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
