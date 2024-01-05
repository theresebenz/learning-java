
import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int result = num1 + num2;
        // int result = (num1 + num2) + 10;
        // this means your adding ten to whatever num1+num2 is
        System.out.println("The sum is: " + result);
    }
}
