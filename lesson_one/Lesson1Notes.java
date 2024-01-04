/*
 * comments
 * varaibles
 * setting up a new file
 * */

// Everything in Java is a class. This name has to be the same as the filename
public class Lesson1Notes {
  public static void main(String[] args) {
    // Execution starts here
    System.out.println("Hello World");

    // here are some variables types
    int x = 0; //store an integer
    long y = 0;//store a bigger integer
    float z = 0; //store a decimal number
    double d = 0.0; //store a bigger decimal number
    String s = ""; // a full string of characters
    char c = 'd'; // a single character
    boolean flag = true; // true/false

    System.out.println(flag);
    x = 1;
    d = 5.5;

    // if we want to add different types, then we have to cast them
    int sum = (int)d + x;
    System.out.println(sum);
  }
}

