//Learning java zero to advanced
//  reverse the digits of a number !

import java.util.Scanner;
public class program35{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to number reverse !");

      System.out.print("Please Enter Your Number : ");
      int num= input.nextInt();
      int reverse = reversenumber(num);
      System.out.println("reverse of your number is : "+reverse);
     
  }
  public static int reversenumber(int num){
    int newnum = 0;
    while(num > 0){
      int digit = num % 10;
      newnum = newnum * 10 + digit;
      num = num / 10;
    }
    return newnum;
  }
}