import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> Int = new ArrayList<Integer>();

        //add elements
        Int.add(5);
        Int.add(25);
        Int.add(20);
        System.out.println(Int);

        //get elements
        int element = Int.get(0);
        System.out.println(element);

        // add element in between
        Int.add(1,10);
        System.out.println(Int);

        //set element
        Int.set(0,30);
        System.out.println(Int);

        //delete element
        Int.remove(3);
        System.out.println(Int);

        //size
        System.out.println(Int.size());

        //loops

        for(int i=0;i<Int.size();i++){
            System.out.println(Int.get(i));
        }

        //sorting
        Collections.sort(Int);
        System.out.println(Int);

    }
}
