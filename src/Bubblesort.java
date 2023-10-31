import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        int a[] = {7,8,3,1,2};
        System.out.println("Initial array:");
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(" " + a[i] + " ");
        }
        //time complexity = O(n^2)
        //bubble sort ascending
        for(int i = 0; i<a.length-1;i++)
        { for(int j =0;j<a.length-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                //swap
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1]= temp;
            }
        }

        }
        System.out.println(" ");
        System.out.println("Array after sorting:");

        //bubble sort for descending
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(" " + a[i] + " ");
        }
        for(int i = 0; i<a.length-1;i++)
        { for(int j =0;j<a.length-i-1;j++)
        {
            if(a[j]<a[j+1])
            {
                //swap
                int temp = a[j+1];
                a[j+1] = a[j];
                a[j]= temp;
            }
        }

        }
        System.out.println(" ");
        System.out.println("Array after sorting:");
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(" " + a[i] + " ");
        }
    }
}
