import java.util.*;
public class Array1 {

    public static class array {

        private long a[];
        private int ci = -1;

        array(int n) {
            this.a = new long[n];
        }

        public void InsertAt(int index1, long value1) {
            this.ci++;
            a[index1] = value1;
        }

        public void Insert(long value2) {
            this.ci++;
            a[ci] = value2;
        }

        public void display() {
            if(ci == -1)
            {
                System.out.println("Array is empty");
            }
            for (int i = 0; i <= ci; i ++) {
                System.out.println("Element at index " +(i+1)+ " is " + a[i]);
            }

        }

        public void getElem(int index2) {
            if (index2 <= ci) {
                System.out.println("The element at given index is " + a[index2]);

            } else {
                System.out.println("Array out of bounds exception");
            }

        }
        public void Search(long value3)
        {
            for(int i = 0;i<=ci;i++)
            {
                if(a[i]== value3)
                {
                    System.out.println("Element is at index"+ i);
                }
            }
        }


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = s.nextInt();
            array a = new array(n);
            while(true)
            {
                System.out.println("Enter 1 to insert element at specified index");
                System.out.println("Enter 2 to insert element at the end");
                System.out.println("Enter 3 to display the array");
                System.out.println("Enter 4 to get element at specified index");
                System.out.println("Enter 5 to get index of a specified element");

                int option = s.nextInt();
                switch(option)
                {
                    case 1:
                        System.out.println("Enter index of element to be inserted:");
                        int i1 =s.nextInt();
                        System.out.println("Enter value to be inserted:");
                        long v1 = s.nextLong();
                        a.InsertAt(i1,v1);
                        break;

                    case 2:
                        System.out.println("Enter value to be inserted:");
                        long v2 = s.nextLong();
                        a.Insert(v2);
                        break;

                    case 3:
                        a.display();
                        break;

                    case 4:
                        System.out.println("Enter index of element to be displayed:");
                        int i3 = s.nextInt();
                        a.getElem(i3);

                    case 5:
                        System.out.println("Enter value to get it's index:");
                        long v3 = s.nextLong();
                        a.Search(v3);
                        break;

                    default:
                        System.out.println("Enter correct instruction");
                }
            }
        }
    }
}
