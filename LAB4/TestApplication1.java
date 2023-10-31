import java.util.Scanner;

/**
 * This class provides a menu-driven test application for using the MyLongArray and Sorting classes
 * to perform various operations on an array, including insertion, retrieval, deletion, display,
 * and sorting.
 */
public class TestApplication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        MyLongArray a = new MyLongArray(size);

        while (true) {
            System.out.println("Enter the option from the above menu :");

            System.out.print("""
                    Menu :
                    1.Insert element at specific index
                    2.Find the index of the value
                    3.Insert the value
                    4.Get the value at given index
                    5.Delete first occurrence of value
                    6.Display the array
                    7.Delete all the occurrences of the value
                    """);

            int opt = sc.nextInt();
            long value;
            switch (opt) {
                case 1:
                    System.out.println("Enter the index to insert the value:");
                    int index = sc.nextInt();
                    System.out.println("Enter the value to insert:");
                    value = sc.nextLong();
                    a.insertAt(index, value);
                    break;
                case 2:
                    System.out.println("Enter the value whose index is to be obtained :");
                    long searchKey = sc.nextLong();
                    System.out.println(a.find(searchKey));
                    break;
                case 3:
                    System.out.println("Insert the value in the array :");
                    value = sc.nextLong();
                    a.insert(value);
                    break;
                case 4:
                    System.out.println("Enter the index to get the value at that index :");
                    int ind = sc.nextInt();
                    System.out.println(a.getElem(ind));
                    break;
                case 5:
                    System.out.println("Enter the value whose first occurrence is to be deleted :");
                    value = sc.nextLong();
                    System.out.println(a.delete(value));
                    break;
                case 6:
                    System.out.println("Displaying the array :");
                    a.display();
                    break;
                case 7:
                    System.out.println("Enter the value whose all occurrences are to be deleted :");
                    value = sc.nextLong();
                    System.out.println(a.dupDelete(value));
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
