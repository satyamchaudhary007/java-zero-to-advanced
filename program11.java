// Learnig java zero to advance
//find  Area of a Triangle program 

import java.util.Scanner;
 
public class program11{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to area of a triangle calculator !");

      System.out.print("please enter your base : ");
      float base = input.nextFloat();

      System.out.print("please enter your hight  : ");
      float hight = input.nextFloat();

      double area = 0.5* base* hight;

      System.out.println("your area of a triangle  : "+ area +"cm");

  }
}