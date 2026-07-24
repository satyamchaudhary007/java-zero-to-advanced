//Learning java zero to advanced
//Fibonacci series  to a certain number !

import java.util.Scanner;
public class program36{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome Fibonacci series ");

      System.out.print("Please Enter the Number upto wich series has to printed : ");
      int num = input.nextInt();
      System.out.println("Here is the Fibonacci Series ");
      printfibonacci(num);
  }
  public static void printfibonacci(int num) {
    if(num < 0) return ;
    System.out.print("0 ");
    if(num == 0) return ;
    System.out.print("1 ");

    int First = 0,Second = 1;
    while(First + Second <= num){
      int third = First+Second;
      System.out.print(third +" ");
      First = Second;
      Second = third;
    }
  }
}