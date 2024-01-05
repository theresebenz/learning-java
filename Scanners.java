//Second Program 
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        //code starts
        //make the scanner
        Scanner input = new Scanner(System.in);

       System.out.print("What is your name: ");
       String name = input.nextLine();

       System.out.println("Hello " + name + ", have a great coding day!");
    }
}


//First Program
/* 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double radius;

        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
        System.out.println(radius);
    }
} */