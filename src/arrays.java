import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s.nextInt();
        }
        int x = s.nextInt();
        for (int i = 0; i < marks.length; i++) {

            if(x == marks[i]) {
                System.out.println("Number found at index :" + i);
            }

        }
    }
}