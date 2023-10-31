import java.util.*;

/**
 * This class represents a custom implementation of a long array with various operations such as insertion,
 * retrieval, deletion, and searching for elements.
 */
public class MyLongArray {
    public long a[];
    public int ci = -1;
    /**
     * Constructor to initialize the array with a given size.
     *
     * @param size The size of the array to be created.
     */
    public MyLongArray(int size)
    {
        this.a = new long[size];
    }

    /**
     * Insert an element at the specified index.
     *
     * @param index The index at which to insert the element.
     * @param value The long value to be inserted.
     */
    public void insertAt(int index, long value)
    {
        if (index > ci) {
            // If the index is greater than the current index, update currentindex(ci) to the new index
            ci = index;

        }

        a[index] = value;

    }


    /**
     * Insert a value without specifying the index, adding it to the end of the array.
     *
     * @param value The long value to be inserted.
     */
    public void insert(long value)
    {
        this.ci++;

        a[ci] = value;
    }

    /**
     * Display the elements of the array.
     */
    public void display()
    {
        for (int i = 0; i <= ci; i++)
        {
            System.out.println("Element at index " + i + " is " + a[i]);
        }
    }

    /**
     * Get the element at a specified index.
     *
     * @param index The index of the element to retrieve.
     * @return The long value at the specified index, or -1 if the index is out of bounds.
     */
    public long getElem(int index)
    {
        if (index <= ci)
        {
            System.out.println("Element at given index is: " + a[index]);
            return a[index];
        }
        else
        {
            System.out.println("ArrayIndexOutOfBoundsException");
            return -1;
        }
    }

    /**
     * Find the index of the first occurrence of a specified element.
     *
     * @param searchKey The value to search for in the array.
     * @return The index of the first occurrence of the element, or -1 if not found.
     */
    public int find(long searchKey)
    {
        for (int i = 0; i <= ci; i++)
        {
            if (a[i] == searchKey)
            {
                System.out.println("Given element is at index: " + i);
                return i;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

    /**
     * Delete an element at a given index.
     *
     * @param index The index of the element to be deleted.
     */
    public void deleteAt(int index) {
        for (int i = index; i < ci; i++) {
            a[i] = a[i + 1];
        }
        ci--;
    }

    /**
     * Delete the first occurrence of an element with the specified value.
     *
     * @param value The value to search for and delete.
     * @return true if the element was found and deleted, false if the element was not found.
     */
    public boolean delete(long value) {
        for (int i = 0; i <= ci; i++) {
            if (a[i] == value) {
                System.out.println("Value found at index: " + i);
                deleteAt(i);
                return true;
            }
        }
        System.out.println("Value not found");
        return false;
    }

    /**
     * Delete all occurrences of an element with the specified value.
     *
     * @param value The value to search for and delete.
     * @return The number of occurrences deleted.
     */
    public int dupDelete(long value) {
        int count = 0;
        for (int i = 0; i <= ci; i++) {
            if (a[i] == value) {
                System.out.println("Value found at index: " + i);
                deleteAt(i);
                count++;
                i--;
            }
        }
        return count;
    }

    /**
     * Get the internal array.
     *
     * @return The internal long array.
     */
    public long[] getArray() {
        return a;
    }

    /**
     * Set the internal array to a given array.
     *
     * @param array The long array to set as the internal array.
     */
    public void setArray(long[] array) {
        this.a = array;
    }
}
