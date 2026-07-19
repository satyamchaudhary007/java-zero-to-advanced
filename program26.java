// Learning java zero to advanced
//shows use of right shift operator.

import java.util.Scanner;

public class program26{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Right shift number");
    System.out.print("please enter your number : ");
    int num = input.nextInt();

    int A = num >> 1;
    System.out.println("your number Right  shift  is : "+ A); 
  }
}