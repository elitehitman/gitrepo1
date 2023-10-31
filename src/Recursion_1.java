import java.util.*;
public class Recursion_1 {

    //Print nos. from 5 to 1.
    public static void PrintNum(int n){
        if(n == 0){                //Base Case/Condition
            return;
        }
        System.out.println(n);     //Print(value)
        PrintNum(n-1);          //recursion

    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        PrintNum(n);
        int x = s.nextInt();
        Printnum(x);
    }
    //Print nos. from 1 to 5.
    public static void Printnum(int x){
        if( x == 6){
            return;
        }
        System.out.println(x);
        Printnum(x+1);
    }
}
