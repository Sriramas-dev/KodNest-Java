
import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter you height: ");
        float height = scan.nextFloat();
        System.out.println("Your height is: " + height);

        scan.nextLine();

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is : " + name);

    }
}
