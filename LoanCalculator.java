
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double rate = input.nextDouble();
        rate = rate/100;

        System.out.print("Enter number of years: ");
        int year = input.nextInt();

        System.out.print("Enter the loan amount: ");
        double loan = input.nextDouble();

        double monthlyRate = rate/12;
        double interestMonthly =  monthlyRate * loan;
        double result = (interestMonthly * 12) * year;

        System.out.println("Your monthly payment is: " + interestMonthly +" and your total paymnet is: " + result);

    }
}
