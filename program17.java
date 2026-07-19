
//Learning Java Zero to Advanced
// take three number from user and find out largest number of three !

import java.util.Scanner;

public class program17{
  public static void main (String args []){
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to find out largest number !!");

    System.out.print("Please Enter Your First  Number : ");
    int First_number = input.nextInt();
    System.out.print("Please Enter Your Second Number : ");
    int second_number = input.nextInt();
    System.out.print("Please Enter Your Third  Number : ");
    int Third_number = input.nextInt();

    if(First_number > second_number && First_number > Third_number){
      System.out.println("Your number is largest :- " + First_number);
    }else if(second_number > First_number && second_number > Third_number){
      System.out.println("Your number is largest :- " + second_number);
    }else if(Third_number > second_number && Third_number > First_number){
      System.out.println("Your number is largest :- " + Third_number);
    }
  }
}