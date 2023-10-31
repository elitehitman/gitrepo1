
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        int total;
        float percentage;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks obtained in subject 1");
        int sub1 = s.nextInt();
        System.out.println("Enter marks obtained in subject 2");
        int sub2 = s.nextInt();
        System.out.println("Enter marks obtained in subject 3");
        int sub3 = s.nextInt();
        System.out.println("Enter marks obtained in subject 4");
        int sub4 = s.nextInt();
        System.out.println("Enter marks obtained in subject 5");
        int sub5 = s.nextInt();
        total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (float) total / 5;
        System.out.println("Percentage obtained");
        System.out.println(percentage);
    }
}
