import java.util.Scanner;
public class PS4Q2 {
    public static void main(String[] args) {

        System.out.println("Enter your yearly salary:");
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        if(a<250000)
        {
            System.out.println("tax to be paid is 0");
        }
        else if(a>=250000 && a<=500000)
        {
            System.out.println("tax to be paid is "+ a*5/100);
        }
        else if(a>500000 && a<=1000000)
        {
            System.out.println("tax to be paid is "+a*20/100);
        }
        else if(a>1000000)
        {
            System.out.println("tax to be paid is"+a*30/100);
        }
        else{
            System.out.println("Write correct salary");
        }
    }
}
