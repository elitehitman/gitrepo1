import java.util.Scanner;

public class Recursion_logn {
    public static int Pow(int x, int n)
    {
        if(n ==0){
            return 1;
        }
        if(x ==0){
            return 0;
        }
        //if n is even
        if(n%2==0)
        {
            return Pow(x,n/2) * Pow(x,n/2);
        }
        else {// n is odd
            return Pow(x,n/2) * Pow(x,n/2) * x;
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int ans = Pow(x,n);
        System.out.println(ans);
    }
}
