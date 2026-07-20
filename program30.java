// Learning java zero to advanced
//User Input Factorial  !! 

import java.util.Scanner;

public class program30{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to find out Factorial !");
  System.out.print("please enter your number : ");
  int num = input.nextInt();
  long fact = Factorial(num);
  System.out.println("Your Factorial of  "+ num +" is : "+ fact);
}

  public static long  Factorial(int fact){
    if(fact < 2 ){
      return 1;
    }
    long facto= 1;
    int i = 2;
    while(i <= fact){
      facto = facto * i;
      i++;
    }
    return facto;
  }
}
