// Learnig java zero to advance
//calculate Perimeter of a rectangle

import java.util.Scanner;

public class program10{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to perimeter of rectangle  !! ");

    System.out.print("Please Enter Your 4 sides  number  : ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();

    System.out.println("your perimeter of rectangle is : "+(a+b+c+d));
  }
}