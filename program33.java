//Learning java zero to advanced
//Greatest Common Divisor (GCD) of two integers.

import java.util.Scanner;
public class program33{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to GCD of two number !");

      System.out.print("Please Enter 1st Your Number : ");
      int First = input.nextInt();
      System.out.print("Please Enter 1st Your Number : ");
      int Second = input.nextInt();
      int GCD = CommonDivisor(First, Second);
      System.out.println("you GCD Of two number is : " + GCD );
  }
  public static int  CommonDivisor(int First,int Second) {
   int gcd = 1;
   int i = 2;
   int least = least(First, Second);
   while(i <= least){
    if(First % i ==0 && Second % i == 0){
      gcd = i;
    }
    i++;
   }
    return gcd;
    }

    public static int  least(int num1,int num2) {
      if(num1 <num2){
        return num1;
      }else {
        return num2;
      }
    }

}