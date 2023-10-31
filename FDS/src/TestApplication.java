/**
 * The MyLongArray class represents an array of long values with various
 * operations for managing and manipulating the array.
 * @author Aditya Shintre
 * @version 0.0.1
 * @since 29/09/23
 */
import java.util.Scanner;
import java.util.Random;


/**
 * The TestApplication class serves as the entry point for the program, allowing
 * users to interact with the MyLongArray class and perform various operations
 * on an array of long values.
 */

public class TestApplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        MyLongArray a = new MyLongArray(size);
        // Displaying a menu for user :
        System.out.print("Menu :\n0.Find the index of the value \n1.Insert the value \n2.Get the value at given index \n3.Delete first occurence of value \n4.Display the array \n5.Delete all the occurences of the value\n6.Displaying array of random numbers\n7.Sorting the elements by Bubble Sort\n8.Sorting the elements by Selection Sort\n9.Sorting the elements by Insertion Sort\n");
        while(true){
            System.out.println("Enter the option from the above menu :");
            int opt = sc.nextInt();
            switch(opt){
                case 0:
                    System.out.println("Enter the value whose index is to be obtained :");
                    long searchkey = sc.nextLong();
                    System.out.println(a.find(searchkey));
                    break;
                case 1:
                    System.out.println("Insert the value in the array :");
                    long value = sc.nextLong();
                    a.insert(value);
                    break;
                case 2:
                    System.out.println("Enter the index to get the value at that index :");
                    int index = sc.nextInt();
                    System.out.println(a.getElement(index));
                    break;
                case 3:
                    System.out.println("Enter the value whose first occurence to be deleted :");
                    value = sc.nextLong();
                    System.out.println(a.delete(value));
                    break;
                case 4:
                    System.out.println("Displaying the array :");
                    a.display();
                    break;
                case 5:
                    System.out.println("Enter the value whose all occurences to be deleted :");
                    value = sc.nextLong();
                    System.out.println(a.dupDelete(value));
                    break;
                case 6:
                    System.out.println("Enter the size of the array of random numbers : ");
                    size = sc.nextInt();
                    a.initArray(size);
                    System.out.println("Array of random numbers is created !");
                    break;
                case 7:
                    System.out.println("Sorting the elements of array using Bubble Sort : ");
                    a.bubbleSort();
                    a.display();
                    break;
                case 8:
                    System.out.println("Sorting the elements of array using Selection Sort : ");
                    a.selectionSort();
                    a.display();
                    break;
                case 9:
                    System.out.println("Sorting the elements of array using Insertion Sort : ");
                    a.insertionSort();
                    a.display();
                    break;
                default:
                    System.out.println("Invalid Input");


            }
        }


    }
}
