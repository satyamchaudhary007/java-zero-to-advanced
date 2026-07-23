//Learning java zero to advanced
// whether a given number is prime or not prime !

import java.util.Scanner;
public class program34{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to prime number checker !");

      System.out.print("Please Enter Your Number : ");
      int num= input.nextInt();
      boolean isprime = isprime(num);
      if(isprime){
        System.out.println("number is prime ");
      }else{System.out.println("number is not prime");}
  }
  public static boolean isprime(int num) {
    int i = 2;
    while(i < num){
      if(num % i == 0)
      {
       return false;
      }
      i++;
    } 

      return true;
  }
}