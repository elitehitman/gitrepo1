import java.util.*;
public class Recursion_2 {

    public static void Sum(int i, int n, int sum){
        if(i-1==n){
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        Sum(i +1,n,sum);

    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            Sum(1,n,0);
         }
}
