import java.util.Scanner;
public class array_int {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = s.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {

            if(number[i]<min) {
                System.out.println("Min:"+number[i]);
            }
            if(number[i]>max){
                System.out.println("Max:"+number[i]);
            }

        }
    }
}