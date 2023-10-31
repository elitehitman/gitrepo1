import java.util.*;
public class Stackclass {
    public static void main(String[] args) {
        GenericStack<Integer> s = new GenericStack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
                }

    }
}
