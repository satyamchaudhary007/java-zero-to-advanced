// Learnig java zero to advance
//take two number from user and perform arithmetic operation ( + -  * / %) !

import java.util.Scanner;

public class program8{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to arithmetic calculator !! ");

    System.out.print("Please Enter Your First_number  number  : ");
    int  First_number = input.nextInt();

    System.out.print("Please Enter Your second_number  number  : ");
    int  second_number = input.nextInt();

    int sum = First_number + second_number;
    int subtract  = First_number - second_number;
    int mul = First_number * second_number;
    int div = First_number / second_number;
    int mod = First_number % second_number;

    System.out.println("Addition       : " + sum);
    System.out.println("Subtraction    : " + subtract);
    System.out.println("multiplication : " + mul);
    System.out.println("Division       : " + div);
    System.out.println("Modulus        : " + mod);
  }
}