
import java.util.Scanner;
public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner s = new Scanner(System.in);
                String a = s.next();
                String b = s.next();
        System.out.println("Hello "+ a +" and " + b);
        System.out.println("Goodbye "+ b + " and " + a);
    }
}
