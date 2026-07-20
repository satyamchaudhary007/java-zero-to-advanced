// Learning java zero to advanced
//Sum Of All Odd Number !! 

import java.util.Scanner;

public class program29{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Odd Sum !");
  System.out.print("please enter your number : ");
  int num = input.nextInt();
  int sum = Oddsum(num);
  System.out.println("OddSum Till "+ num +" is "+ sum);
}

  public static int Oddsum(int num){
    int sum = 0;
    int i = 1;
    while(i <= num){
      sum = sum + i;
      i = i + 2;
    }
    return sum;
  }
}
