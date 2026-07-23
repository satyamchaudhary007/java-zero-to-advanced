
// Learning java zero to advanced
// computes the sum of the digits of an integer

import java.util.Scanner;

public class program31{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to sum of Digit !");

      System.out.print("Please enter your number : ");
      int num = input.nextInt();
      int sum = sumofdigit(num);
      System.out.println("your sum of digit is : "+sum);
  }
  public static int  sumofdigit(int num) {
    int sum = 0;
    while(num > 0){
        sum = sum + num % 10;
        num = num / 10;
    }
      return sum;
  }
}