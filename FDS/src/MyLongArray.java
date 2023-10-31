import java.util.Random;
import java.util.Scanner;

public class MyLongArray {
    private long temp;                // Temporary variable for sorting
    public int size;                 // The size of the array
    private int currentindex = 0;     // The current index for insertion
    private long a[];                 // The array to store long values
    Scanner sc = new Scanner(System.in); // Scanner class for user input


    /**
     * Constructs a MyLongArray object with the specified size and initializes
     * the array with user input.
     *
     * @param size The size of the array.
     */
    public MyLongArray(int size) {
        this.size = size;
        a = new long[size];


        // Accepts and fills the array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + " :");
            a[i] = sc.nextLong();
            currentindex++;
        }
    }


    /**
     * Finds the index of a given search key in the array.
     *
     * @param searchkey The value to search for.
     * @return The index of the search key if found; otherwise, -1.
     */
    public int find(long searchkey) {
        for (int i = 0; i < currentindex; i++) {
            if (a[i] == searchkey) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Inserts a new value into the array if there is space available.
     *
     * @param value The value to insert.
     */
    public void insert(long value) {
        if (currentindex < size - 1) {
            a[currentindex] = value;
            currentindex++;
        } else {
            System.out.println("ARRAY IS FULL.");
        }
    }


    /**
     * Fetches the element at the specified index in the array.
     *
     * @param index The index of the element to fetch.
     * @return The element at the specified index if it exists; otherwise, -1.
     */
    public long getElement(int index) {
        if (index < currentindex) {
            return a[index];
        } else {
            return -1;
        }
    }


    /**
     * Deletes the first occurrence of the specified value from the array and
     * shifts the remaining elements to fill the gap.
     *
     * @param value The value to delete.
     * @return True if the value was deleted; false if the value was not found.
     */
    public boolean delete(long value) {
        int index = find(value);
        if (index != -1) {
            for (int i = index; i < currentindex - 1; i++) {
                a[i] = a[i + 1];
            }
            currentindex--;
            return true;
        }
        return false;
    }


    /**
     * Removes all occurrences of a given value from the array and shifts
     * the remaining elements to fill the gap returns the count of deleted elements.
     *
     * @param value The value to remove.
     * @return The count of deleted elements.
     */
    public int dupDelete(long value) {
        int count = 0;
        for (int i = 0; i < currentindex - 1; i++) {
            if (a[i] == value) {
                for (int j = i; j < currentindex - 1; j++) {
                    a[j] = a[j + 1];
                }
                currentindex--;
                count++;
                i--;
            }
        }
        return count;
    }


    /**
     * Displays all elements in the array.
     */
    public void display() {
        for (int i = 0; i < currentindex; i++) {
            System.out.println("Element at index " + i + "  : " + a[i]);
        }
    }


    /**
     * Initializes the array with random long values.
     *
     * @param size The size of the array to initialize.
     */
    public void initArray(int size) {
        currentindex = 0;
        a = new long[size];
        Random randnum = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = randnum.nextLong();
            currentindex++;
        }
    }


    /**
     * Sorts the array using the bubble sort algorithm.
     */
    public void bubbleSort() {
        for (int m = size - 1; m > 1; m--) {
            for (int n = 0; n < m; n++) {
                if (a[n] > a[n + 1]) {
                    temp = a[n];
                    a[n] = a[n + 1];
                    a[n + 1] = temp;
                }
            }
        }
    }


    /**
     * Sorts the array using the selection sort algorithm.
     */
    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }


    /**
     * Sorts the array using the insertion sort algorithm.
     */
    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            temp = a[i];
            int j = i;
            while (j > 0 && temp <= a[j - 1]) {
                a[j] = a[j - 1];
                --j;
            }
            a[j] = temp;
        }
    }
}
