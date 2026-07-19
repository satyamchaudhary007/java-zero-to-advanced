//Learning Java Zero to Advanced
//determines if a number is odd or even  !

import java.util.Scanner;

public class program16{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to find a number is odd or even !! ");

  System.out.print("Hello please enter your number : ");
  int number = input.nextInt();

  if (number % 2 == 0){
    System.out.println("your number "+number+" is even ");
  }else{
    System.out.println("your number "+number+" is odd ") ;
  }
  }
}
