//Learning Java Zero to Advanced
//determines if a number is positive, negative,or zero !

import java.util.Scanner;

public class program15{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to find number is posative or negative !! ");

  System.out.print("Hello please enter your number : ");
  int number = input.nextInt();

  if (number % 2 == 1){
    System.out.println("your number is negative ");
  }else if(number == 0){
    System.out.println("your number is zero ");
  }else {
    System.out.println("your number is posative ");
  }
  }
}
