//Learning java zero to advanced
//Palindrome Number checker  !

import java.util.Scanner;
public class program38{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Pelindrome Number ");
      System.out.print("Please Enter Your Number : ");
      int num = input.nextInt();
      boolean isPalindrome = isPalindrome(num);
      if(isPalindrome){
        System.out.println("Your Number is a Palindrome");
      } else
      {
        System.out.println("Your Number is not a palindrome ");
      }
  }
  public static boolean isPalindrome(int num) {
    return num == reverce(num);
  }
  public static int reverce(int num) {
    int NewNum = 0;
    while(num > 0){
      int digit = num % 10 ;
      NewNum = NewNum * 10 + digit ;
      num = num / 10;
    }
      return NewNum;
  }
}