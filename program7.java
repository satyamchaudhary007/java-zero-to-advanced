// Learnig java zero to advance
//swap  two numbers program !

import java.util.Scanner;

public class program7{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to number swaping !! ");

    System.out.print("Please Enter Your First_number  number  : ");
    int  First_number = input.nextInt();

    System.out.print("Please Enter Your second_number  number  : ");
    int  second_number = input.nextInt();

    int sum;
    sum = First_number;
    First_number =second_number;
    second_number = sum;

    System.out.println("your First_number is  : " +First_number);
    System.out.println("your second_number is : " +second_number);
  }
}