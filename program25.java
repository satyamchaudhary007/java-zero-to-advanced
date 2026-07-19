
// Learning java zero to advanced
// shows bitwise  of left shift  number.

import java.util.Scanner;

public class program25{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to lrft shift number");
    System.out.print("please enter your number : ");
    int num = input.nextInt();

    int A = num << 1;
    System.out.println("your number left shift  is : "+ A); 
  }
}