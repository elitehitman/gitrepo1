import java.util.*;
/**
 * A class for converting decimal numbers to binary representation using a generic stack.
 */
public class DecimalToBinaryConverter {
    /**
     * Converts a decimal number to its binary representation.
     *
     * @param decimal The decimal number to be converted.
     * @return The binary representation of the decimal number as a string.
     */
    public static String toBinary(int decimal) {
        GenericStack<Integer> stack = new GenericStack<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }
        StringBuilder binary = new StringBuilder(); 
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal = s.nextInt();
        String binary = toBinary(decimal);
        System.out.println("Binary representation:"+ binary);
    }
}
