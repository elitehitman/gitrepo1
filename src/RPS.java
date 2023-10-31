import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rock =1, paper =2, scissor =3;
        System.out.println("Enter numbers from 1-3 for Rock paper and scissor");
        int user = s.nextInt();
        Random r = new Random();
        System.out.println("Rock =1,Paper=2,Scissor=3  :"+r.nextInt(1,3));
    }
}
