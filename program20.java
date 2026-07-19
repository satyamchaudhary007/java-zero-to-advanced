// Learning java zero to advanced
// Categorize a person into different age Groups

import java.util.Scanner;

public class program20{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to age Categorize Group  !! ");

      System.out.print("Please enter your age : ");
      int age  = input.nextInt();
      if(age >=0 && age <=13){
        System.out.println("You are Child");
      }else if (age  >= 14 && age <=20 ){
        System.out.println("you are Teen  ");
      }else if (age  >= 21 && age <=60){
        System.out.println("you are Adult ");
      }else if (age >= 61 && age  <=100){
        System.out.println("You are Senior !");
      }else{
        System.out.println("please enter valid age  !! ");
      }
}
}