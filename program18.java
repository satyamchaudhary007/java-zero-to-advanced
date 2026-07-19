
import java.util.Scanner;

// Learnig java zero to advanced
// find out user input year is a leap year or not !!

public class program18{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to leap year finder !! ");

      System.out.print("Please enter your year : ");
      int year = input.nextInt();

      if(year % 400 == 0){
        System.out.println("your year is leap year ");
      }else if (year % 100 == 0){
        System.out.println("your year is not a leap year ");
      }else if(year % 4 == 0){
         System.out.println("your year is a leap year ");
      }
  }
}