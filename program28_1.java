
// Learning java zero to advanced
// multiplication table program !

import java.util.Scanner;

public class program28_1{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to multiplication table !");
      System.out.print("Please Enter Your Number : ");
      int num = input.nextInt(); 
      multiplication(num);
  }
  public static void multiplication(int num) {

    int i = 1;
      while (i <= 10 ) {
        System.out.println(num + " X " + i + "=" +(num * i));
                 i++;
      }
      
  }
}