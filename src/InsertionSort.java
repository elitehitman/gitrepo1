public class InsertionSort {
    public static void main(String[] args) {

        int a[] = {7,8,3,1,2};
        System.out.println("Initial array:");
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        //time complexity = O(n^2)
        //Insertion Sort
        for(int i = 1;i<a.length;i++)
        {
            int current = a[i]; //unsorted part
            int j = i-1;        //sorted part
            while(j >= 0 && current < a[j] )
            {
                a[j+1] = a[j];
                j--;
            }
            //placement
            a[j+1] = current;
        }
        System.out.println();
        System.out.println("Array after sorting;");
        for(int i = 0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
