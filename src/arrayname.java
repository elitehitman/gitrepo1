import java.util.Scanner;
public class arrayname {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] name = new String[n];
        for(int i = 0; i<name.length;i++)
        {
            name[i] = s.next();
        }
        for(int i = 0; i<name.length;i++)
        {
            System.out.println(name[i]);
        }
    }
}
