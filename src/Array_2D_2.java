import java.util.*;
public class Array_2D_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] number = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++)
            {
                number[i][j] =  s.nextInt();
            }

        }
        int x = s.nextInt();
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++)
            {
                if(number[i][j]==x){
                    System.out.println(+i+","+j);
                }
            }
            System.out.println();
        }
    }
}
