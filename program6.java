// Learnig java zero to advance
//Create a program to add two numbers.
import java.util.Scanner;

public class program6{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to sum of two number calculator !! ");

    System.out.print("Please Enter Your First_number  number  : ");
    int  First_number = input.nextInt();

    System.out.print("Please Enter Your second_number  number  : ");
    int  second_number = input.nextInt();

    int sum = First_number + second_number;
    System.out.println("your sum of two number is  " + sum +" \n");
    System.out.println("thank you !!");
  }
}