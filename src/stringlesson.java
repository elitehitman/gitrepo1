import java.util.Locale;
import java.util.Scanner;
public class stringlesson {
    public static void main(String[] args) {
     // String name = "Aditya";
     // System.out.println(name);
    //  String lstring = name.toLowerCase();
  //      System.out.println(lstring);
//        String a = "I am Aditya";
        //String rstring = a.replace(" ","_");
        //System.out.println(a);
        //System.out.println(rstring);
        String letter = "Dear <|name|>, Thanks a lot.";
        System.out.println(letter);
        Scanner s = new Scanner(System.in);
       String name = s.next();
        String newletter = letter.replace("<|name|>",name);
        System.out.println(newletter);



    }
}
