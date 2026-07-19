
// Learning java zero to advanced
// shows bitwise compliment   of a number.

import java.util.Scanner;

public class program24{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to lrft shift number");
    System.out.print("please enter your number : ");
    int num = input.nextInt();

    int A = ~num;
    System.out.println("your number compliment  is : "+ A); 
  }
}