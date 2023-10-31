import java.util.*;

/**
 * This class demonstrates the creation and printing of a 2D array in Java.
 */
public class Array_2D_1 {

    /**
     * This is the main method where the program starts execution.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the 2D array
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = s.nextInt();

        // Create a 2D array to store the entered numbers
        int[][] number = new int[r][c];

        // Prompt the user to enter values for the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                number[i][j] = s.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
