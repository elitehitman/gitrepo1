import java.util.Scanner;
public class PS4Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks obtained as per your subjects:");
        System.out.println("sub1:");
        int sub1 = s.nextInt();
        System.out.println("sub2:");
        int sub2 = s.nextInt();
        System.out.println("sub3:");
        int sub3 = s.nextInt();
        int total = sub1 + sub2 + sub3;
        float per = total/3f;
        if(sub1 <33 || sub2 <33 || sub3 <33 || total < 40)
        {
            System.out.println("student has failed");
        }
        else
        {
            System.out.println("student has passed");
        }

    }
}
