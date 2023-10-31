import java.util.Scanner;
public class Recursion_3 {
    public static void Fact(int i, int n, int fact){
        if(i==0){
            System.out.println(fact);
            return;
        }
        fact = fact*i;
        Fact(i-1,n,fact);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Fact(n,n,1);
    }
}
