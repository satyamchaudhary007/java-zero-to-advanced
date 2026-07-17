// Learnig java zero to advance
//Create a program to input name of the person and respond with ”Welcome NAME to KG Coding”
import java.util.Scanner;

public class program5{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome !! ");

    System.out.print("Please Enter Your Name : ");
    String name = input.nextLine();

    System.out.println("Welcome " + name + " to KG Coding");
  }
}