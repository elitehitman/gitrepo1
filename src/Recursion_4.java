import java.util.Scanner;

public class Recursion_4 {
    //public static int Fact(int n){
    //  if(n==1 || n==0){
    //    return 1;
    //       }
    //     int fact_nm1 = Fact(n-1);
    //   int fact_n = fact_nm1*n;
    // return fact_n;
//    }
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            int n = s.nextInt();
//        int ans = Fact(n);
//        System.out.println(ans);
//        int a =0, b =1;
//        System.out.println(a);
//        System.out.println(b);

//        Fib(a,b,n-2);
            int ans = Pow(x,n);
        System.out.println(ans);
    }

//    public static void Fib(int a, int b, int n) {
//        if(n==0){
//            return;
//        }
//
//        int c = a+ b;
//        System.out.println(c);
//        Fib(b,c,n-1);

        public static int Pow(int x, int n)
        {
            if(n ==0){
                    return 1;
            }
            if(x ==0){
                return 0;
            }
            int xnm1 = Pow(x,n-1);
            int xn   =  x*xnm1;
            return xn;
        }

}
