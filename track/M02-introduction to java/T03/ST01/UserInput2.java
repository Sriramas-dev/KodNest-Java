
import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a byte value");
        byte a = scan.nextByte();
        System.out.println("The Byte value is: " + a);

        System.out.println("Enter a short value");
        short b = scan.nextShort();
        System.out.println("The Short value is: " + b);

        System.out.println("Enter a integer value");
        int c = scan.nextInt();
        System.out.println("The Int value is: " + c);

        System.out.println("Enter a long value");
        long d = scan.nextLong();
        System.out.println("The long value is: " + d);

        System.out.println("Enter a float value");
        float e = scan.nextFloat();
        System.out.println("The Float value is : " + e);

        System.out.println("Enter a double value");
        double f = scan.nextDouble();
        System.out.println("The Double value is : " + f);

        System.out.println("Enter a boolean value");
        boolean g = scan.nextBoolean();
        System.out.println("The Boolean value is : " + g);

    }
}
