import java.util.Scanner;
public class PSQ1 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = c.nextInt();
        System.out.println("Enter number 2");
        int num2 = c.nextInt();
        System.out.println("Enter number 3");
        int num3 = c.nextInt();
        int sum = num1 + num2 + num3;
        System.out.print("Sum:");
        System.out.println(sum);
    }
}
