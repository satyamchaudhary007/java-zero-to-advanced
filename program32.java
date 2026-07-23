//Learning java zero to advanced
//Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;
public class program32{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to LCM of two number !");

      System.out.print("Please Enter 1st Your Number : ");
      int First = input.nextInt();
      System.out.print("Please Enter 1st Your Number : ");
      int Second = input.nextInt();
      int div = LCMoftwonum(First, Second);
      System.out.println("you Lcm Of two number is : " + div );

  }
  public static int  LCMoftwonum(int First , int Second) {
    int i = 1;
    while (true) { 
        int factor = First * i;
        if(factor % Second == 0){
          return factor;
        }
        i++;
    }
  }
}