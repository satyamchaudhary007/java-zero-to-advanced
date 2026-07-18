// Learnig java zero to advance
//take two floating point number from user and perform multiplication  operation !

import java.util.Scanner;

public class program9{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to arithmetic calculator !! ");

    System.out.print("Please Enter Your First_number  number  : ");
    float  First_number = input.nextFloat();

    System.out.print("Please Enter Your second_number  number  : ");
    float  second_number = input.nextFloat();

    
    double mul = First_number * second_number;
    System.out.println("result is : " + mul);
  }
}