
// Learning java zero to advanced
// multiplication table program !

import java.util.Scanner;

public class program28{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to multiplication table !");

      System.out.print("Please Enter Your Number : ");
      int num = input.nextInt();

      int i = 1;
      while (i <= 10 ) {
        System.out.println(num + " X " + i + "=" +(num * i));
                 i++;

      }
  }
}