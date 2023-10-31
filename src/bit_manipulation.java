import java.util.*;
public class bit_manipulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //get
        int n = s.nextInt();
        int pos = s.nextInt();
        int bitmask = 1<<pos;
        if((bitmask & n) == 0){
            System.out.println("Bit is zero");
        }
        else {
            System.out.println("Bit is one");
        }
        //set
        int a = s.nextInt();
        int p = s.nextInt();
        int bitMask = 1<<p;
        int newNumber = bitMask | a;
        System.out.println(newNumber );

    }
}
