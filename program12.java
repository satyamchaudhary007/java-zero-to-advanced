// Learnig java zero to advance
// program to calculate simple interest.

import java.util.Scanner;
 
public class program12{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to simple intrest calculator !");

      System.out.print("please enter your principal amount  : ");
      int principal = input.nextInt();

      System.out.print("please enter your intrest   : ");
      int intrest = input.nextInt();

      System.out.print("please enter your time   : ");
      int time = input.nextInt();

      double simpleintrest = (principal * intrest * time )/ 100;

      System.out.println("your simpal intrest is : " + simpleintrest);

  }
}