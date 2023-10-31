import java.util.Scanner;
public class ArrAsc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = s.nextInt();
        }
        boolean Asc = true;
        for (int i = 0; i < n-1; i++) {
            if (number[i] > number[i + 1]) {
                Asc = false;
            }

        }
        if (Asc) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }

    }
}