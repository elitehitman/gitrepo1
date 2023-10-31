import java.util.Scanner;
public class PSQ3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter distance in kilometres:");
        float km = s.nextFloat();
        System.out.println("Distance in miles:");
        System.out.println(0.6213711922*km);
    }
}
