// Learning java zero to advanced
//check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class program27{
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Welcome to Odd/Even calculator ");

  System.out.print("Please Enter Your Number : ");
  int num = input.nextInt();

  if((num & 1 )== 1){
    System.out.println("Your Number is Odd ");
  }else if((num & 0) == 0){
    System.out.println("Your Number is Even ");
  }
}
}